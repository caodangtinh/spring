package com.tinhcao.spring.service;

public class Communication {
	private Messaging messaging;
	private Encryption encryption;

	public Communication(Encryption encryption) {
		this.encryption = encryption;
	}

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}

	public void communicate() {
		encryption.encryptData();
		messaging.sendMessage();
	}

}
