package com.tinhcao.spring.autowire.byType.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	private EmployeeAddress address;

	public EmployeeAddress getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
