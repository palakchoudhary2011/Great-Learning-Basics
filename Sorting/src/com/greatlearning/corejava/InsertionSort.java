package com.greatlearning.corejava;

import java.util.Iterator;
import java.util.Scanner;

public class InsertionSort {

	public int array_length; 
	public int array[]; 
	public int sortedValue;
	
	Scanner sc = new Scanner(System.in);
	
	public void takeValueFromUser() {
		
		System.out.println("Please enter no of element you want to sort ?");
		array_length = sc.nextInt();
		array = new int[array_length];
		
		System.out.println("Enter array elements : ");
		
		for( int i = 0; i < array_length ; i++) {
			array[i] = sc.nextInt();
		}
		
		for( int i = 0; i< array_length; i++) {
			System.out.print(array[i] + ",");
		}
		sortedValue += 1 ;
		
		sortArray();
	}
	
	public void sortArray() {
		int j = sortedValue;
		
			
			
			if( j > 0 && j <= array_length && array[j] < array[j-1]) {
				System.out.println( "array" + array[j] + " "+ array[j-1]);
				int temp = array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
				sortedValue += 1;
				j--;
				for( int i = 0; i< array_length; i++) {
					System.out.print(array[i] + ",");
				}
				
				System.out.println("array_length " + j + " " + array_length);
			}
			
			
			
		
		// print array iterations
					
		
	}
	
	public static void main(String args[]) {
		// take array input from user
		InsertionSort sort = new InsertionSort();
		sort.takeValueFromUser();
	
	}
}
