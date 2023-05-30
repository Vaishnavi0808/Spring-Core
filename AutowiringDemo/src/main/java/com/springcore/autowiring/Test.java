package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
//		Canteen canteen=new Canteen();
//		canteen.setCanteenName("Dhaba");
//		
//		System.out.println(canteen);
//		
//		School school=new School("Somalwar",canteen);
//		System.out.println(school);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/spring.xml");
		School school=(School)context.getBean("schoolBean");
		System.out.println(school);

	}

}
