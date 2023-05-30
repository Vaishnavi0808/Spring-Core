package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		Student student=(Student) context.getBean("studentBean");
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAddress());
		
		
		System.out.println(student);
	
	}


}
