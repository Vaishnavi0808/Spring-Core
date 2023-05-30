package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class School {
	private String name;
	
	@Autowired
	private Canteen canteen;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Canteen getCanteen() {
		return canteen;
	}


	public void setCanteen(Canteen canteen) {
		this.canteen = canteen;
	}


	public School(String name, Canteen canteen) {
		super();
		this.name = name;
		this.canteen = canteen;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", canteen=" + canteen + "]";
	}
	
	
	

}
