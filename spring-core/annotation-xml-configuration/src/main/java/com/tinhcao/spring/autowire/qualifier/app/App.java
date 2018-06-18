package com.tinhcao.spring.autowire.qualifier.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tinhcao.spring.autowire.qualifier.config.AppConfig;
import com.tinhcao.spring.autowire.qualifier.domain.Bond;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Bond bean = (Bond) context.getBean("bond");
		bean.showCar();
		context.close();
	}

}
