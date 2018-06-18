package com.tinhcao.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service("fileService")
public class FileServiceImpl implements FileService {
	@Value("${jdbc.url:jdbc://localhost:3306/test}")
	private String url;

	@Value(value = "${jdbc.username:tinhcao}")
	private String username;

	@Value(value = "${jdbc.password:1234}")
	private String password;

	@Autowired
	private Environment environment;

	@Override
	public void readValues() {
		System.out.println("url " + this.url);
		System.out.println("username " + this.username);
		System.out.println("password " + this.password);
		System.out.println("show_sql " + environment.getProperty("hibernate.show_sql"));
		System.out.println("dialect " + environment.getProperty("hibernate.dialect"));
	}

}
