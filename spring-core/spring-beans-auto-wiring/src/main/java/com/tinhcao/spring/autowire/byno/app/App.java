package com.tinhcao.spring.autowire.byno.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.autowire.byno.domain.Driver;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire-configuration.xml");
		Driver driver = (Driver) context.getBean("driver");
		System.out.println(driver.getCar());
		System.out.println(driver.getLicense());
		context.close();
	}

}
