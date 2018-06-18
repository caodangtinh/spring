package com.tinhcao.spring.autowire.qualifier.domain;

import org.springframework.stereotype.Component;

@Component("ferari")
public class Ferari implements Car {

	@Override
	public String getCarName() {
		return "Ferari";
	}

}
