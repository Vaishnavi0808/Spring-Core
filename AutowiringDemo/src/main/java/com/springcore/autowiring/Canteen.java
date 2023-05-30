package com.springcore.autowiring;

public class Canteen {
	private String canteenName;

	public String getCanteenName() {
		return canteenName;
	}

	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}

	
	
	@Override
	public String toString() {
		return "Canteen [canteenName=" + canteenName + "]";
	}

	public Canteen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
