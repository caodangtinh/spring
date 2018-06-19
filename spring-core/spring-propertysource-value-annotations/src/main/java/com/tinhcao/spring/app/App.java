package com.tinhcao.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.config.AppConfig;
import com.tinhcao.spring.service.FileService;

public class App {

	public static void main(String[] args) {
//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("property-configuration.xml");
		FileService fileService = (FileService) context.getBean("fileService");
		fileService.readValues();
		context.close();
	}

}
