package com.greatlearning.corejava;

public class CustomerDriver {

	public static void main(String[] args) {
		
		Customer  cust = new Customer();
		
		// custName is public 
		System.out.println("Customer name " + cust.custName);
		
		// custAge is private 
		// System.out.println("Customer age " + cust.custAge);
		// this is cause compile time error 
		
		// custCode is protected
		System.out.println("Customer code " + cust.custCode);
	}
}
