package com.tinhcao.spring.autowire.byname.domain;

public class ApplicationUser {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplicationUser [name=" + name + "]";
	}
}
