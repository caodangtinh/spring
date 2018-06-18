package com.tinhcao.spring.autowire.byType.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tinhcao.spring.autowire.byType.config.AppConfig;
import com.tinhcao.spring.autowire.byType.domain.Employee;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getAddress());

		context.close();
	}

}
