package com.tinhcao.spring.autowire.byType.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.autowire.byType.domain.Employee;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire-configuration.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getAddress());

		context.close();
	}

}
