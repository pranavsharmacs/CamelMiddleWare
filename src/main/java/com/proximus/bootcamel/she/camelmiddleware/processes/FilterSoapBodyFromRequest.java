package com.proximus.bootcamel.she.camelmiddleware.processes;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Headers;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.helpers.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.siebel.customui.BGCCustomerConsultationgetCustomerMigrationStatus2Output;
import com.siebel.xml.bgcsoapexception.v1.BGCException;

import bgc.objects.vss.functionalerror.v1.FunctionalErrorType;
import bgc.objects.vss.technicalerror.v1.TechnicalErrorType;
import bgc.services.aia.customerconsultation.v1.FunctionalFaultMessage;
import bgc.services.aia.customerconsultation.v1.TechnicalFaultMessage;
import bgc.objects.vss.functionalerror.v1.ObjectFactory;

@Component(value = "filterSoapBodyFromRequest")
public class FilterSoapBodyFromRequest {
	/**
	 * To get the Logger instance for log message.
	 */

	private static final Logger LOGGER = Logger.getLogger("org.camel.audit");

	/**
	 * Log the request .
	 *
	 * @param exchange
	 *
	 */

	@Handler
	public void filterESBSoap(Exchange exchange, @Headers Map<String, Object> headers) throws Exception {
		LOGGER.info("FilterSoapBodyFromRequest::filterESBSoap()::enters");

		String soapRequest = exchange.getIn().getBody(String.class);
		// System.out.println("Request XML is ::::: " + soapRequest);
		String header = exchange.getIn().getBody(org.apache.camel.impl.DefaultMessage.class)
				.getBody(org.apache.camel.component.cxf.CxfPayload.class).getHeaders().toString();
		System.out.println("Header : " + header);
		int startIndex = soapRequest.indexOf("<soapenv:Body>");
		int endIndex = soapRequest.indexOf("</soapenv:Body>");
		String filteredSoapRequest = soapRequest.substring(startIndex + 14, endIndex).trim();
		System.out.println("Filtered Soap Request is : " + soapRequest.substring(startIndex + 14, endIndex).trim());
		exchange.getOut().setBody(filteredSoapRequest, String.class);
	}

	@Handler
	public void padSHESoapEnvelop(Exchange exchange, @Headers Map<String, Object> headers) {
		LOGGER.info("FilterSoapBodyFromRequest::padSHESoapEnvelop::enters");
		String soapRequest = exchange.getIn().getBody(String.class);
		System.out.println("Inside FilterSoapBodyFromRequest::pasSHESoapEnvelop : " + soapRequest);
		// soapRequest.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
		// "");
		// TODO : correct below code, it is bad way to replace the xml version
		// tag
		soapRequest = soapRequest.substring(38);
		String sheSoapHeader = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Header/><soapenv:Body>";
		String sheSoapFooter = "</soapenv:Body></soapenv:Envelope>";
		String paddedSHESoapRequest = sheSoapHeader + soapRequest + sheSoapFooter;
		System.out.println("SHE soap request message : " + paddedSHESoapRequest);
		exchange.getOut().setBody(paddedSHESoapRequest, String.class);
	}

	@Handler
	public void filterSHESoap(Exchange exchange, @Headers Map<String, Object> headers) throws Exception {
		LOGGER.info("FilterSoapBodyFromRequest::filterSHESoap()::enters");

		String soapRequest = exchange.getIn().getBody(String.class);
		// System.out.println("Request XML is ::::: " + soapRequest);
		/*
		 * String header =
		 * exchange.getIn().getBody(org.apache.camel.impl.DefaultMessage.class)
		 * .getBody(org.apache.camel.component.cxf.CxfPayload.class).getHeaders(
		 * ).toString(); System.out.println("Header : " + header);
		 */
		int startIndex = soapRequest.indexOf("<SOAP-ENV:Body>");
		int endIndex = soapRequest.indexOf("</SOAP-ENV:Body>");
		String filteredSoapRequest = soapRequest.substring(startIndex + 15, endIndex).trim();
		// System.out.println("Filtered Soap Request is :
		// "+soapRequest.substring(startIndex+14, endIndex).trim());
		exchange.getOut().setBody(filteredSoapRequest, String.class);
	}

	@Handler
	public void filterSHESoapErrors(Exchange exchange, @Headers Map<String, Object> headers) throws Exception {
		LOGGER.info("FilterSoapBodyFromRequest::filterSHESoap()::enters");

		String soapRequest = exchange.getIn().getBody(String.class);

		int startIndex = soapRequest.indexOf("<SOAP-ENV:Body>");
		int endIndex = soapRequest.indexOf("</SOAP-ENV:Body>");
		String filteredSoapRequest = soapRequest.substring(startIndex + 15, endIndex).trim();

		JAXBContext jaxbContext = JAXBContext
				.newInstance(BGCCustomerConsultationgetCustomerMigrationStatus2Output.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<BGCCustomerConsultationgetCustomerMigrationStatus2Output> sheResponse = jaxbUnmarshaller.unmarshal(
				new StreamSource(new StringReader(filteredSoapRequest)),
				BGCCustomerConsultationgetCustomerMigrationStatus2Output.class);
		BGCCustomerConsultationgetCustomerMigrationStatus2Output sheResponseObj = sheResponse.getValue();
		BGCException bgcException = sheResponseObj.getBGCException();
		FunctionalErrorType functionalError = null;
		TechnicalErrorType technicalError = null;
		if (bgcException.getErrorCode() != null && !bgcException.getErrorCode().isEmpty()) {
			System.out.println("SHE Responded with error, take the error out put and transform to PIM error response");
			String errorCode = bgcException.getErrorCode();
			String errorType = bgcException.getErrorType();
			String detailDescription = bgcException.getDetailDescription();

			if (errorType.contains("Functional")) {
				functionalError = new FunctionalErrorType();
				functionalError.setCode(Long.parseLong(errorCode));
				functionalError.setDescription(detailDescription);
				functionalError.setOriginator("SHE");
				functionalError.setDescription("Functional");
				functionalError.setCorrelationId("some random no.");
			} else {
				technicalError = new TechnicalErrorType();
				technicalError.setCode(Long.parseLong(errorCode));
				technicalError.setDescription(detailDescription);
			}
		}

		if (technicalError != null) {
			jaxbContext = JAXBContext.newInstance(TechnicalFaultMessage.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			TechnicalFaultMessage techFaultMsg = new TechnicalFaultMessage("TechnicalFault", technicalError);
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();

			jaxbMarshaller.marshal(new JAXBElement<TechnicalFaultMessage>(
					new QName("urn:v1.technicalerror.vss.objects.bgc", "TechnicalError"), TechnicalFaultMessage.class,
					techFaultMsg), sw);

			String techFaultResponse = sw.toString();
			exchange.getIn().setBody(techFaultResponse, String.class);

		} else if (functionalError != null) {
			jaxbContext = JAXBContext.newInstance(FunctionalFaultMessage.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			FunctionalFaultMessage funcFaultMsg = new FunctionalFaultMessage("FunctionalFault",
					new ObjectFactory().createFunctionalError(functionalError).getValue());
			System.out.println("functional fault from functional fault message : " + funcFaultMsg.getFaultInfo());
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(new JAXBElement<FunctionalFaultMessage>(
					new QName("urn:v1.functionalerror.vss.objects.bgc", "FunctionalError"),
					FunctionalFaultMessage.class, funcFaultMsg), sw);

			String funcFaultResponse = sw.toString();
			funcFaultResponse = funcFaultResponse.replace("<stackTrace/>", "").trim();
			funcFaultResponse = funcFaultResponse.replace("\n", "");
			exchange.getOut().getHeaders().put("SOAPError", "FunctionalError");
			exchange.getOut().setBody(funcFaultResponse, String.class);
			System.out.println(">>>>>>>>>>>>>>>> " + exchange.getIn().getBody(String.class));

		} else {
			exchange.getOut().setBody(filteredSoapRequest, String.class);
		}
	}

	@Handler
	public void padESBSoapEnvelop(Exchange exchange, @Headers Map<String, Object> headers) throws Exception {
		LOGGER.info("FilterSoapBodyFromRequest::padESBSoapEnvelop::enters");
		String soapResponse = exchange.getIn().getBody(String.class);
		soapResponse = soapResponse.trim();
		System.out.println(">>>>>>>>>>>>> soapResponse " + soapResponse);
		System.out.println("SOAPError : " + exchange.getIn().getHeader("SOAPError"));
		String paddedSHESoapRequest = null;
		String sheSoapFooter = null;
		String aia2esbSoapResponseHeader = null;
		FileInputStream fisTargetFile = null;
		//remove the <?xml version="1.0" encoding="UTF-8" standalone="yes"?> from the response
		soapResponse = soapResponse.substring(55);
		if (soapResponse.contains("FunctionalError")) {
			// This is a case of functional error, and treat it accordingly
			fisTargetFile = new FileInputStream(
					new File("src/main/resources/static/AIA2ESBSoapErrorResponseHeader.xml"));
			aia2esbSoapResponseHeader = IOUtils.toString(fisTargetFile, "UTF-8");
			sheSoapFooter = "</detail></env:Fault></env:Body></env:Envelope>";
		} else {
			//System.out.println("Inside FilterSoapBodyFromRequest::padESBSoapEnvelop : " + soapResponse);
			fisTargetFile = new FileInputStream(
					new File("src/main/resources/static/AIA2ESBSoapResponseHeader.xml"));
			aia2esbSoapResponseHeader = IOUtils.toString(fisTargetFile, "UTF-8");
			//System.out.println("aia2esbSoapResponseHeader : " + aia2esbSoapResponseHeader);
			sheSoapFooter = "</env:Body></env:Envelope>";
		}

		paddedSHESoapRequest = aia2esbSoapResponseHeader + soapResponse + sheSoapFooter;
		System.out.println("ESB soap response message : " + paddedSHESoapRequest);
		exchange.getIn().setBody(paddedSHESoapRequest, String.class);
	}

}
