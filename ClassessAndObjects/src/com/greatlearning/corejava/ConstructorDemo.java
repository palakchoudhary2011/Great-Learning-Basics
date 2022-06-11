package com.greatlearning.corejava;

public class ConstructorDemo {

	ConstructorDemo(){
		System.out.println("My name is Palak choudhary and my age is 26");
	}
	ConstructorDemo(String name, int age){
		System.out.println("My name is " + name + " and my age is " + age);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cust = new ConstructorDemo();
		ConstructorDemo cust1 = new ConstructorDemo("Roshan", 28);
		
	}
}
