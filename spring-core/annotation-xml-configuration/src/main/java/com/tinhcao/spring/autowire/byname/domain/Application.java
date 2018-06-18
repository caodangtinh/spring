package com.tinhcao.spring.autowire.byname.domain;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("application")
public class Application {
	
	@Resource(name = "applicationUser")
	private ApplicationUser applicationUser;

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	@Override
	public String toString() {
		return "Application [applicationUser=" + applicationUser + "]";
	}

}
