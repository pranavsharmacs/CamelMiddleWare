package com.proximus.bootcamel.she.camelmiddleware.processes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import bgc.billing.audit4bil.Producer;
import bgc.billing.model.Audit;

public class AuditProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		/*Message message = exchange.getIn();

		String correlationId = message.getHeader("JMSCorrelationID").toString();
		System.out.println("Correlation ID in AuditProcess is : " + correlationId);*/

		Audit audit = populateAuditPOJO(exchange);
		try {
			Producer.getInstance().setConfigLocation("src/main/resources/elasticConfig/elasticSearch_Dev.props");
			Producer.getInstance().sendMessage(audit);
		} catch (Exception e) {
			System.out.println("Could not send message to Elastic");
		}

	}

	public Audit populateAuditPOJO(Exchange exchange) {

		// Create the Audit object here
		Audit audit = new Audit();
		//Message message = exchange.getIn();
		String jmsCorrelationId = exchange.getProperty("JMSCorrelationID").toString();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SS'Z'");
		Date startTime = new Date();
		Date endTime = new Date();
		try {
			startTime = df.parse(exchange.getProperty("MessageStartTime").toString());
			endTime = df.parse(exchange.getProperty("MessageEndTime").toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String envName = exchange.getProperty("EnvironmentName").toString();
		String consumerId = exchange.getProperty("ConsumerId").toString();
		String endUserId = exchange.getProperty("endUserId").toString();
		String status = exchange.getProperty("TransactionStatus").toString();
		String actionName = exchange.getProperty("ActionName").toString();
		String subActionName = exchange.getProperty("SubActionName").toString();

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