package com.proximus.bootcamel.she.camelmiddleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import bgc.billing.audit4bil.Producer;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ImportResource({ "classpath:META-INF/spring/camel-context-all-in-one.xml" })
public class CamelmiddlewareApplication {

	public static void main(String[] args) {

		SpringApplication.run(CamelmiddlewareApplication.class, args);
	}
}
