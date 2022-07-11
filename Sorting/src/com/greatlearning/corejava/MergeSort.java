package com.greatlearning.corejava;

import java.util.Iterator;
import java.util.Scanner;

public class MergeSort {
	
	public int arr_length;
	public int array[], lerft[], right[];
	Scanner sc = new Scanner(System.in);
	
	public void takeInputFromUser() {
		System.out.println("Enter lenth of array");
		arr_length = sc.nextInt();
		array = new int[arr_length];
		
		System.out.println("Add elements in array");
		for( int i = 0; i< arr_length ; i++ ) {
			array[i] = sc.nextInt();
		}
		
		printArray(array);
		
		sortArray(array, 0, arr_length-1);
		
		printSortedArray(array);
	}
	
	public void printArray(int array[]) {
		System.out.println("Entered Array is " );
		for(int i = 0; i< array.length ; i++) {
			System.out.print( array[i] + "  ");
		}
	}
	
	public void printSortedArray(int array[]) {
		System.out.println("Sorted Array is " );
		for(int i = 0; i< array.length ; i++) {
			System.out.print( array[i] + "  ");
		}
	}
	
	public void sortArray(int arr[], int left, int right) {
		if( left < right) {
			int mid = ( left + right ) / 2;
			sortArray(arr, left, mid);
			sortArray(arr, mid +1 , right);
			
			mergeArray(arr, left , mid, right);
		}
	}
	
	public void mergeArray(int array[], int left, int mid , int right) {
		int lengthOfLeftArray = mid - left + 1;
		int lengthOfRightArray = right - mid;
		
		int leftArr[] = new int[lengthOfLeftArray];
		int rightArr[] = new int[lengthOfRightArray];
		
		for (int i = 0; i < lengthOfLeftArray; i++) {
			leftArr[i] = array[left + i];
		}
		for (int i = 0; i < lengthOfRightArray; i++) {
			rightArr[i] = array[mid + 1 + i];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		if(i < lengthOfLeftArray && j < lengthOfRightArray) {
			if( leftArr[i] <= rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			}
			else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		if( i < lengthOfLeftArray) {
			array[k] = leftArr[i];
			i++;
			k++;
		}
		
		if( j < lengthOfRightArray) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
	}
	public static void main(String arge[]) {
		MergeSort merge = new MergeSort();
		merge.takeInputFromUser();
	}
}
