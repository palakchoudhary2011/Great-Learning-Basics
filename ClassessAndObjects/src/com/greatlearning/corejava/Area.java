package com.greatlearning.corejava;

public class Area {

	final float pi = 22/7;
	public float radius, result;
	
	public static void main(String[] args) {
		Area area = new Area();
		area.radius = 22.1f;
		
		area.result = area.pi * area.radius * area.radius;
		
		System.out.println("Area of circle is " + area.result);
	}
}
