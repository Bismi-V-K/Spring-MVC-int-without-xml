package com.bismi.lc.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.bismi.lc.config.controllers")
public class Config {

	@Bean
	InternalResourceViewResolver viewresolver(){
		InternalResourceViewResolver viewresolver=new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}
}
