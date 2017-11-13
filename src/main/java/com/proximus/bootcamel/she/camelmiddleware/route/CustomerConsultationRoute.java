package com.proximus.bootcamel.she.camelmiddleware.route;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

//@Component("route CustomerConsultation")
public class CustomerConsultationRoute extends SpringRouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		/*getContext().setTracing(true);
		from("cxf:bean:soapHttpESBEndpoint")
		.
		.to(
				"bean:endpointLogger?method=logEvent(*,*,*,'Received Order Status Notification from MCOM at AIA',true)");*/
	}

}
