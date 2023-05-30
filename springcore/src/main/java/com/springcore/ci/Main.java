package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person=(Person) context.getBean("personBean");
		
		System.out.println(person);
	}

}
