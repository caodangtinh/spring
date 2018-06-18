package com.tinhcao.spring.autowire.byno.domain;

public class Driver {
	private License license;
	private Car car;

	public Driver(Car car) {
		this.car = car;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}

}
