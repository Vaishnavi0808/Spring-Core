package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	
	@Value("Vaishnavi")
	private String name;
	
	@Value("123")
	private int id;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public void DisplayData(){
		System.out.println("Student details");
		System.out.println("--------------------");
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " + id);
	
}

	public void study()
	{
		System.out.println("Student is reading book");
	}

}
