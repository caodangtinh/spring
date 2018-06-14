package com.tinhcao.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.config.DependencyConfiguration;
import com.tinhcao.spring.service.Communication;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-configuration.xml");
//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DependencyConfiguration.class);
		Communication communication = (Communication) context.getBean("communication");
		communication.communicate();
		context.close();
	}

}
