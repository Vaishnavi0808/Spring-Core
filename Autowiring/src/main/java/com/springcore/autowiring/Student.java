package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {
	private int id;
	private String name;
	
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		//System.out.println("using setter");
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("using constructor");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
