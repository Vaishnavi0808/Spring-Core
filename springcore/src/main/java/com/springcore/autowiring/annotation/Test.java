package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Emp emp=(Emp)context.getBean(Emp.class);
		
		System.out.println(emp);
	}

}
