package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.javaconfig.Student1;

@Configuration
@ComponentScan("com.springcore.javaconfig")
public class DemoMain {
	public static ApplicationContext context;

	public static void main(String[] args) {
		
		
		context=new  AnnotationConfigApplicationContext(DemoMain.class);
		Student1 student=context.getBean(Student1.class);
		
		//System.out.println(student);
		student.DisplayData();
		student.study();

	}

}
