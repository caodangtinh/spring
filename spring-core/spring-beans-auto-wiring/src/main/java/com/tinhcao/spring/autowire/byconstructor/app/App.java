package com.tinhcao.spring.autowire.byconstructor.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tinhcao.spring.autowire.byconstructor.domain.Performer;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire-configuration.xml");
		Performer performer = (Performer) context.getBean("performer");
		System.out.println(performer.getInstrument());

		context.close();
	}

}
