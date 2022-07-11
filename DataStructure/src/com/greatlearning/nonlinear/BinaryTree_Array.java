package com.greatlearning.nonlinear;

import java.util.Scanner;

public class BinaryTree_Array {

	static Scanner sc = new Scanner(System.in);
	static int tree[];
	static int size, i;
	
	public static void main(String args[]) {
		
		BinaryTree_Array bArray = new BinaryTree_Array();
		
		bArray.insertIntoArray();
		
		bArray.printArray();
		
	}
	
	public static void insertIntoArray() {
		System.out.println("Enter Array size : ");
		size = sc.nextInt();
		
		tree = new int[size+1];
		
		System.out.println("Enter elements into array : ");
		for( i = 1; i<= tree.length; i++) {
			tree[i] = sc.nextInt();
		}
	}
	
	public static void printArray() {
		for(int j = 0; j< i; j++) {
			System.out.println(tree[j] + ",");
		}
	}
	
}
