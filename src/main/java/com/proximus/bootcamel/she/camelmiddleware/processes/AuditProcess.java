package com.proximus.bootcamel.she.camelmiddleware.processes;

import java.util.Date;
import java.util.Random;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import bgc.billing.model.Audit;
import bgc.billing.model.ExtraKeyVal;
import bgc.billing.model.Audit.Status;


public class AuditProcess implements Processor {
	public void process(Exchange exchange) throws Exception {
		// Create the Audit object here
		/*Audit audit = new Audit();
		Date then = new Date();

		audit.setComponent("CTT");
		audit.setStartDateTime(then);
		audit.setActionName("bgc.services.csl.account.v10");
		audit.setActionSubName("GetBalance");
		audit.setCorrelationId("abc-" + new Random().nextInt(100000));
		audit.setCorrelationId2("0039-jhd-748966");
		audit.setConsumerId("09");
		audit.setEndUserID("ID876321");
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
		audit.setTimeTakenAction(audit.getEndDateTime().getTime()
				- audit.getStartDateTime().getTime());*/

		Message message = exchange.getIn();
		String correlationId = message.getHeader("JMSCorrelationID").toString();
		System.out.println("Correlation ID in AuditProcess is : " + correlationId);
		String actionName = message.getHeader("SOAPAction").toString();
		System.out.println("SOAP Action in AuditProcess is : " + actionName);
		/*Audit auditBean = new Audit();
		auditBean.setCorrelationId(correlationId);
		auditBean.setActionName(actionName);
		auditBean.setConsumerId();
		auditBean.setStartDateTime();
		auditBean.setEndDateTime();
		auditBean.setEnvironment();
		auditBean.setErrCode();
		auditBean.setErrDetailedDescription();
		auditBean.setStatus();
		auditBean.setTimeTakenAction(auditBean.getEndDateTime().getTime() - auditBean.getStartDateTime().getTime());*/
	}

}