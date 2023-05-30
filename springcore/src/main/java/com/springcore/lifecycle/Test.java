package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		Product product=(Product) context.getBean("p1");
		
		System.out.println(product);
		
		context.registerShutdownHook();
		
//		ProductAnnotation pa=(ProductAnnotation) context.getBean("a1");
//		
//		System.out.println(pa);
//		
//		context.registerShutdownHook();
	}

}
