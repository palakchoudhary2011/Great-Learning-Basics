package com.greatlearning.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTreeDrive {

	static Scanner sc = new Scanner(System.in);
	static int value;
	static int array[];
	static int array_size;
	static Node root = null;
	static Node result = null;
	
	public static void main(String args[]) {
		
		BinarySearchTreeService bst = new BinarySearchTreeService();

		int value, num;
		System.out.println("Enter no of values: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
//			System.out.println("\nInsert value at " + (i + 1) + ": ");
			value = sc.nextInt();
			if (root == null) {
				root = bst.insert(root, value);
				} 
			else {
				result = bst.insert(root, value);
				if (result.key == value)i -= 1;
				}
			System.out.println("Inorder of Binary Tree\n");
			bst.inorder(root);
			}
		sc.close();
	}
}
