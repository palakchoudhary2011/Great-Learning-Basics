package com.greatlearning.corejava;

import java.util.Arrays;

public class RadixSort {
	
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int getMaxElement(int array[], int size) {
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	static void countSort(int array[], int size, int exp) {
		int output[] = new int[size];
		int i;
		int count[] = new int[10];
		
		Arrays.fill(count, 0);
		
		for (int j = 0; j < size; j++) {
			count[(array[j] / exp ) % 10]++ ;
		}
		
		for( i = 1 ; i< 10 ; i++) {
			count[i] += count[i-1];
		}
		
		for (i = size; i>= 0; i--) {
			output[count[(array[i] / exp ) % 10] - 1] = array[i];
			count[( array[i] / exp) % 10]--;
		}
		for (i = 0; i< size; i++) {
			array[i] = output[i];
		}
		
	}
	
	static void radixSort(int array[], int size) {
		int m = getMaxElement(array, size);
		
		for (int i = 1; m / i > 0; i *= 10) {
			countSort(array, size, i);
		}
	}
	public static void main(String args[]) {
		int array[] = {170, 45, 75, 90, 802, 24, 2, 66};
		int n = array.length;
		System.out.println("Array before sorting");
		printArray(array);
		
		radixSort(array,n);
		
		System.out.println("Array after sorting");
		printArray(array);
	}
}
