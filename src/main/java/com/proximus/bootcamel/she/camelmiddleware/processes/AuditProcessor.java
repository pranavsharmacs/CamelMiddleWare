package com.proximus.bootcamel.she.camelmiddleware.processes;

import java.util.Date;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import bgc.billing.audit4bil.Producer;
import bgc.billing.model.Audit;

public class AuditProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		Message message = exchange.getIn();

		String correlationId = message.getHeader("JMSCorrelationID").toString();
		System.out.println("Correlation ID in AuditProcess is : " + correlationId);

		Audit audit = populateAuditPOJO(exchange);
		try {
			Producer.getInstance().setConfigLocation(
					"src/main/resources/elasticConfig/elasticSearch_Dev.props");
			Producer.getInstance().sendMessage(audit);
		} catch (Exception e) {
			System.out.println("Could not send message to Elastic");
		}

	}

	public Audit populateAuditPOJO(Exchange exchange) {
		
		boolean isJMSMessage = true;
		// Create the Audit object here
		Audit audit = new Audit();
		if(isJMSMessage){
			Message message = exchange.getIn();
			
			String jmsFromQ = message.getHeader("JMSDestination").toString();
			String jmsMessageId = message.getHeader("JMSMessageID").toString();
			String jmsTimeStamp = message.getHeader("JMSTimestamp").toString();
			String jmsCorrelationId = message.getHeader("JMSCorrelationID").toString();
			String reDeliveredFlag = message.getHeader("JMSRedelivered").toString();
			String jmsOriginSystem = message.getHeader("MessageOriginSystem").toString();
			String jmsDestinationSystem = message.getHeader("MessageDestinationSystem").toString();
			Date startTime = new Date();//message.getHeader("MessageStartTime").toString();
			Date endTime = new Date();//message.getHeader("MessageEndTime").toString();
			String envName = message.getHeader("EnvironmentName").toString();
			String status = message.getHeader("TransactionStatus").toString();
			String actionName = message.getHeader("OrderProgress").toString();
			String subActionName = message.getHeader("EventDataOrderProgress").toString();
			
			audit.setActionName(actionName);
			audit.setActionSubName(subActionName);
			audit.setConsumerId("id973752");
			audit.setCorrelationId(jmsCorrelationId);
			audit.setStartDateTime(startTime);
			audit.setEndDateTime(endTime);
			audit.setEndUserID("MCOM");
			audit.setEnvironment(envName);
			//audit.setErrCode(errCode);
			//audit.setErrDetailedDescription(errDetailedDescription);
			// TO-DO			
			//audit.setExtraKeyVal(extraKeyVal);
			audit.setStatus(Audit.Status.SUCCESS);
			audit.setTimeTakenAction(endTime.getTime()-startTime.getTime());
			
			
			
			/*Endpoint endPoint = exchange.getFromEndpoint();
			String routeId = exchange.getFromRouteId();
			Date createdDate = exchange.getCreated();
			HashMap<String, Object> propsMap = (HashMap<String, Object>) exchange.getProperties();
			*/
		}
		else{
			String soapRequestXML = exchange.getIn().getBody(String.class);
			Map<String, Object> headerMap = exchange.getIn().getHeaders();
		}
		
		
		
		
	/*	Date then = new Date();

		audit.setComponent("TestData_FromCamel");
		audit.setStartDateTime(then);
		audit.setActionName("TestData_FromCamel");
		audit.setActionSubName("TestData_FromCamel");
		audit.setCorrelationId("TestData_FromCamel-" + new Random().nextInt(100000));
		audit.setCorrelationId2("TestData_FromCamel");
		audit.setConsumerId("TestData_FromCamel");
		audit.setEndUserID("TestData_FromCamel");
		Status s = Status.valueOf("SUCCESS");
		audit.setStatus(s);
		ExtraKeyVal xKeyVal = new ExtraKeyVal();
		audit.setExtraKeyVal(xKeyVal);
		xKeyVal.setCUSTID("123");
		xKeyVal.setNA("0475662039");
		// add new Key Val pair in the extraKeyVal property
		xKeyVal.setAdditionalProperty("NewProperty", "SomeValue");

		Date now = new Date();
		audit.setEndDateTime(now);
		audit.setTimeTakenAction(audit.getEndDateTime().getTime() - audit.getStartDateTime().getTime());*/

		/*
		 * String actionName = message.getHeader("SOAPAction").toString();
		 * System.out.println("SOAP Action in AuditProcess is : " + actionName);
		 * 
		 * 
		 * 
		 * /*Audit auditBean = new Audit();
		 * auditBean.setCorrelationId(correlationId);
		 * auditBean.setActionName(actionName); auditBean.setConsumerId();
		 * auditBean.setStartDateTime(); auditBean.setEndDateTime();
		 * auditBean.setEnvironment(); auditBean.setErrCode();
		 * auditBean.setErrDetailedDescription(); auditBean.setStatus();
		 * auditBean.setTimeTakenAction(auditBean.getEndDateTime().getTime() -
		 * auditBean.getStartDateTime().getTime());
		 */
		return audit;

	}

}