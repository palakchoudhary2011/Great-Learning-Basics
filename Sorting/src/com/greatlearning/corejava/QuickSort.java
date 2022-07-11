package com.greatlearning.corejava;

import java.util.Scanner;

public class QuickSort {
	
	public int array_length;
	public int array[];
	public int p_index;
	Scanner sc = new Scanner(System.in);
	
	public void takeInputFromUser() {
		System.out.println("Enter array length");
		array_length = sc.nextInt();
		array = new int [array_length];
		
		System.out.println("Add elements in array ");
		for (int i = 0; i < array_length; i++) {
			array[i] = sc.nextInt();
		}
		
		printArray("Entered array is ", array);
		
		quickSort(array, 0, array.length - 1);
		
		printArray("Sorted array is ", array);
	}

	public void printArray(String stat, int array[]) {
		System.out.println(stat );
		for(int i = 0; i< array.length ; i++) {
			System.out.print( array[i] + "  ");
		}
	}
	
	// quicksort recursive funtion 
	public void quickSort(int arr[], int low, int high) {
		if( low < high) {
			p_index = partition(array, low, high);
			quickSort(arr, low, p_index - 1);
			quickSort(arr, p_index + 1, high);
			
		}
	}
	// partition function
	public int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = low ;
		for (int j = 0; j <= high; j++) {
			if( array[i] < pivot) {
				i++;
				swap(array, i , j);
			}
		}
		swap(array, i+1, high);
		return i+1;
	}
	
	public int[] swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
				
		return array;
	}
	public static void main(String args[]) {
		QuickSort quickSort = new QuickSort();
		quickSort.takeInputFromUser();
	}
}
