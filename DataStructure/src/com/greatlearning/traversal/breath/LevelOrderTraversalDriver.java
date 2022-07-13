package com.greatlearning.traversal.breath;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import com.greatlearning.traversal.breath.Node;

public class LevelOrderTraversalDriver {

	static int value;
	static Scanner sc = new Scanner(System.in);
	Deque<Node> queue = new LinkedList<Node>();
	public static void main(String args[]) {
			LevelOrderTraversalService levelOrder = new LevelOrderTraversalService();
			
			Node root = null;
			String status = "a";
			while (!status.equals("s")) {
				System.out.println("Enter value to insert:");
				value = sc.nextInt();
				root = levelOrder.insertNode(root, value);
				System.out.println("Binary Tree using level order Traversal");
				levelOrder.levelOrder(root);
				System.out.println("\nEnter s to stop or any char to continue insertion");
				status = sc.next();
			}
			System.out.println("Program Completed successfully!!!");
		
	}
}
