package com.tinhcao.spring.autowire.qualifier.domain;

import org.springframework.stereotype.Component;

@Component("mustang")
public class Mustang implements Car {

	@Override
	public String getCarName() {
		return "Mustang";
	}

}
