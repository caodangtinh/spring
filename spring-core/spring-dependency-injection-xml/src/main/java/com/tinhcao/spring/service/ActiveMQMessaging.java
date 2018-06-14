package com.tinhcao.spring.service;

public class ActiveMQMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending message via Active MQ");
	}

}
