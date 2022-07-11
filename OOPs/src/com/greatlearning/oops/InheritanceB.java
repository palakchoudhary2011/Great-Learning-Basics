package com.greatlearning.oops;

public class InheritanceB extends InheritanceA{

	float areaOfRectange;
	
	public float calculateAreaOfRectangle(float width, float length) {
		areaOfRectange = width * length;
		
		return areaOfRectange;
	}
}
