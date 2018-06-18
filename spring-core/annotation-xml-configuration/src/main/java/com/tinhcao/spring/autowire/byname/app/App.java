package com.tinhcao.spring.autowire.byname.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.autowire.byname.config.AutowireConfiguration;
import com.tinhcao.spring.autowire.byname.domain.Application;


public class App {

	public static void main(String[] args) {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire-configuration.xml");
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AutowireConfiguration.class);
		Application application = (Application) context.getBean("application");
		System.out.println(application.getApplicationUser().getName());
		
		context.close();
	}

}
