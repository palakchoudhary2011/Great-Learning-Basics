package com.greatlearning.oops;

public class InheritanceC extends InheritanceB{

	
		float areaOfTriangle;
		
		public float calculateAreaOfTriangle(float height, float base) {
			areaOfTriangle = height * base / 2 ;
			
			return areaOfTriangle;
			
		}
		
		public static void main(String[] args) {
			
			InheritanceC obj = new InheritanceC();
			
			System.out.println("Area of Circle is " + obj.calculateAreaOfCircle(10));
			System.out.println("Area of Rectangle is " + obj.calculateAreaOfRectangle(10, 20));
			System.out.println("Area of Triangle is " + obj.calculateAreaOfTriangle(10, 20));
			
			
			
		}
}
