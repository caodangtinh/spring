package com.tinhcao.spring.autowire.byname.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tinhcao.spring.autowire.byname.domain.Application;
import com.tinhcao.spring.autowire.byname.domain.ApplicationUser;


@Configuration
public class AutowireConfiguration {
	@Bean(name = "applicationUser")
	public ApplicationUser getApplicationUser() {
		ApplicationUser applicationUser = new ApplicationUser();
		applicationUser.setName("tinhcao");
		return applicationUser;
	}

	@Bean(name = "application")
	public Application getApplication() {
		Application application = new Application();
		application.setApplicationUser(getApplicationUser());
		return application;
	}
}
