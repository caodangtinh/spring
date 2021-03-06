package com.tinhcao.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tinhcao.spring.service.ActiveMQMessaging;
import com.tinhcao.spring.service.Communication;
import com.tinhcao.spring.service.Encryption;
import com.tinhcao.spring.service.Messaging;
import com.tinhcao.spring.service.RSAEncryption;

@Configuration
public class DependencyConfiguration {

	@Bean(name = "activeMqMessaging")
	public Messaging getMessaging() {
		return new ActiveMQMessaging();
	}

	@Bean(name = "encryption")
	public Encryption getEncryption() {
		return new RSAEncryption();
	}

	@Bean(name = "communication")
	public Communication getCommunication() {
		Communication communication = new Communication(getEncryption());
		communication.setMessaging(getMessaging());
		return communication;
	}
}
