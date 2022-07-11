package com.greatlearning.oops;

public class Object {

	void copyMe() {

		System.out.println("Inside copy me method");
	
	}
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		obj.copyMe();
	}
}
