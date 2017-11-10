package com.proximus.bootcamel.she.camelmiddleware.processes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Headers;
import org.apache.cxf.helpers.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

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
		//System.out.println("Request XML is ::::: " + soapRequest);
		String header = exchange.getIn().getBody(org.apache.camel.impl.DefaultMessage.class)
				.getBody(org.apache.camel.component.cxf.CxfPayload.class).getHeaders().toString();
		System.out.println("Header : " + header);
		int startIndex = soapRequest.indexOf("<soapenv:Body>");
		int endIndex = soapRequest.indexOf("</soapenv:Body>");
		String filteredSoapRequest = soapRequest.substring(startIndex+14, endIndex).trim();
		System.out.println("Filtered Soap Request is : "+soapRequest.substring(startIndex+14, endIndex).trim());
		exchange.getIn().setBody(filteredSoapRequest, String.class);
	}

	@Handler
	public void padSHESoapEnvelop(Exchange exchange, @Headers Map<String, Object> headers){
		LOGGER.info("FilterSoapBodyFromRequest::padSHESoapEnvelop::enters");
		String soapRequest = exchange.getIn().getBody(String.class);
		System.out.println("Inside FilterSoapBodyFromRequest::pasSHESoapEnvelop : " + soapRequest);
		//soapRequest.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
		//TODO : correct below code, it is bad way to replace the xml version tag
		soapRequest = soapRequest.substring(38);
		String sheSoapHeader = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Header/><soapenv:Body>";
		String sheSoapFooter = "</soapenv:Body></soapenv:Envelope>";
		String paddedSHESoapRequest = sheSoapHeader + soapRequest + sheSoapFooter;
		System.out.println("SHE soap request message : " + paddedSHESoapRequest);
		exchange.getIn().setBody(paddedSHESoapRequest, String.class);
	}

	@Handler
	public void filterSHESoap(Exchange exchange, @Headers Map<String, Object> headers) throws Exception {
		LOGGER.info("FilterSoapBodyFromRequest::filterSHESoap()::enters");

		String soapRequest = exchange.getIn().getBody(String.class);
		//System.out.println("Request XML is ::::: " + soapRequest);
		/*String header = exchange.getIn().getBody(org.apache.camel.impl.DefaultMessage.class)
				.getBody(org.apache.camel.component.cxf.CxfPayload.class).getHeaders().toString();
		System.out.println("Header : " + header);*/
		int startIndex = soapRequest.indexOf("<SOAP-ENV:Body>");
		int endIndex = soapRequest.indexOf("</SOAP-ENV:Body>");
		String filteredSoapRequest = soapRequest.substring(startIndex+15, endIndex).trim();
		//System.out.println("Filtered Soap Request is : "+soapRequest.substring(startIndex+14, endIndex).trim());
		exchange.getIn().setBody(filteredSoapRequest, String.class);
	}

	@Handler
	public void padESBSoapEnvelop(Exchange exchange, @Headers Map<String, Object> headers) throws Exception{
		LOGGER.info("FilterSoapBodyFromRequest::padESBSoapEnvelop::enters");
		String soapResponse = exchange.getIn().getBody(String.class);
		System.out.println("Inside FilterSoapBodyFromRequest::padESBSoapEnvelop : " + soapResponse);
		soapResponse = soapResponse.substring(38);

		FileInputStream fisTargetFile = new FileInputStream(new File("src/main/resources/static/AIA2ESBSoapResponseHeader.xml"));

		String aia2esbSoapResponseHeader = IOUtils.toString(fisTargetFile, "UTF-8");
		System.out.println("aia2esbSoapResponseHeader : " + aia2esbSoapResponseHeader);
		String sheSoapFooter = "</env:Body></env:Envelope>";
		String paddedSHESoapRequest = aia2esbSoapResponseHeader + soapResponse + sheSoapFooter;
		System.out.println("ESB soap response message : " + paddedSHESoapRequest);
		exchange.getIn().setBody(paddedSHESoapRequest, String.class);
	}

}
