package com.tinhcao.spring.service;

public class RSAEncryption implements Encryption {

	@Override
	public void encryptData() {
		System.out.println("Encrypting data using RSA Encryption");
	}

}
