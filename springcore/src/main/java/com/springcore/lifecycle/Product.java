package com.springcore.lifecycle;

public class Product {
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Product(Double price) {
		super();
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
	

}
