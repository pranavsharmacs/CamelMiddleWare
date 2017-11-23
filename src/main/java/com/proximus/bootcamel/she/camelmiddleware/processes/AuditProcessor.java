package com.proximus.bootcamel.she.camelmiddleware.processes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import bgc.billing.audit4bil.Producer;
import bgc.billing.model.Audit;
import bgc.billing.model.ExtraKeyVal;

public class AuditProcessor implements Processor {

	private static final Logger LOGGER = Logger.getLogger("org.camel.audit");

	public void process(Exchange exchange) throws Exception {

		/*
		 * Message message = exchange.getIn();
		 *
		 * String correlationId =
		 * message.getHeader("JMSCorrelationID").toString(); System.out.println(
		 * "Correlation ID in AuditProcess is : " + correlationId);
		 */
		LOGGER.info("AuditProcessor::process()::enters : " + new Date().getTime());
		Audit audit = populateAuditPOJO(exchange);

		try {
			Producer.getInstance().setConfigLocation("src/main/resources/elasticConfig/elasticSearch_Dev.props");
			Producer.getInstance().sendMessage(audit);
		} catch (Exception e) {
			System.out.println("Could not send message to Elastic");
		}
		LOGGER.info("AuditProcessor::process()::exits : " + new Date().getTime());
	}

	public void processDetailed(Exchange exchange) throws Exception {
		Date startTime = new Date();
		LOGGER.debug("AuditProcessor::processDetailed()::enters : " + new Date().getTime());
		String messageXML = exchange.getIn().getBody().toString();
		Audit auditDetailed = populateAuditPOJO(exchange);
		ExtraKeyVal keyVal = new ExtraKeyVal();
		keyVal.setAdditionalProperty("MessageXML", messageXML);
		auditDetailed.setExtraKeyVal(keyVal);

		try {
			Producer.getInstance()
					.setConfigLocation("src/main/resources/elasticConfig/elasticSearch_Dev_Detailed.props");
			Producer.getInstance().sendMessage(auditDetailed);
		} catch (Exception e) {
			System.out.println("Could not send message to Elastic");
		}
		LOGGER.info("AuditProcessor::processDetailed()::time taken : " + (new Date().getTime() - startTime.getTime()) + " ms");

	}

	public Audit populateAuditPOJO(Exchange exchange) {

		// TODO : Set the component specific to the flow in Audit object

		// Create the Audit object here
		Audit audit = new Audit();
		// Message message = exchange.getIn();
		String jmsCorrelationId = exchange.getProperty("JMSCorrelationID").toString();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SS'Z'");
		Date startTime = new Date();
		Date endTime = new Date();
		try {
			startTime = df.parse(exchange.getProperty("MessageStartTime").toString());
			if (exchange.getProperty("MessageEndTime") != null) {
				endTime = df.parse(exchange.getProperty("MessageEndTime").toString());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String envName = exchange.getProperty("EnvironmentName").toString();
		String consumerId = exchange.getProperty("ConsumerId").toString();
		String endUserId = exchange.getProperty("endUserId").toString();
		String status = "IN_PROCESS";
		if (exchange.getProperty("TransactionStatus") != null) {
			status = exchange.getProperty("TransactionStatus").toString();
		}
		String actionName = exchange.getProperty("ActionName").toString();
		String subActionName = exchange.getProperty("SubActionName").toString();
		// String component = exchange.getProperty("Component").toString();

		audit.setActionName(actionName);
		audit.setActionSubName(subActionName);
		audit.setConsumerId(consumerId);
		audit.setCorrelationId(jmsCorrelationId);
		audit.setStartDateTime(startTime);
		audit.setEndDateTime(endTime);
		audit.setEndUserID(endUserId);
		audit.setEnvironment(envName);
		audit.setStatus(Audit.Status.fromValue(status));
		audit.setTimeTakenAction(endTime.getTime() - startTime.getTime());

		return audit;

	}

}
