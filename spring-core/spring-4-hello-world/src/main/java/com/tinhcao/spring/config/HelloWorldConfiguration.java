package com.tinhcao.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.tinhcao.spring.bean.HelloWorld;
import com.tinhcao.spring.bean.HelloWorldImpl;

@Configuration
public class HelloWorldConfiguration {

	@Bean(name = "helloWorldBean")
	@Description("HelloWorld Bean Desciption")
	public HelloWorld getHelloWorld() {
		return new HelloWorldImpl();
	}
}
