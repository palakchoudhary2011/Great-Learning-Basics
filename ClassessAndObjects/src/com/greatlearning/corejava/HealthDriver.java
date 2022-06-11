package com.greatlearning.corejava;

public class HealthDriver {

		public static void main(String[] args) {
			Health health = new Health();
			
			health.age = 25;
			health.weight = 55;
			health.bmi = 3;
			
			System.out.println("Weight is "+ health.weight);
			System.out.println("Age is "+ health.age);
			System.out.println("BMI is "+ health.bmi);
			
		}
}
