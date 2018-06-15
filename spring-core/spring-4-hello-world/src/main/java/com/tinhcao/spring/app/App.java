package com.tinhcao.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.bean.HelloWorld;
import com.tinhcao.spring.bean.HelloWorldImpl;
import com.tinhcao.spring.config.HelloWorldConfiguration;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("hello-world-configuration.xml");
		HelloWorld helloWorldBean = (HelloWorld) context.getBean(HelloWorldImpl.class);
		helloWorldBean.sayHello("tinhcao");
		context.close();
	}

}
