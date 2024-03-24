package com.bismi.lc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class LCApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext application=new AnnotationConfigWebApplicationContext();
		application.register(Config.class);
		
		//create dispatcher servlet object
		DispatcherServlet dis=new DispatcherServlet(application);
		
		//register dispatcher servlet with servlet context
		ServletRegistration.Dynamic mycustomDispatcherSevlet=servletContext.addServlet("myServlet",dis);
		mycustomDispatcherSevlet.setLoadOnStartup(1);
		mycustomDispatcherSevlet.addMapping("/mywebsite.com/*");
	}

}
