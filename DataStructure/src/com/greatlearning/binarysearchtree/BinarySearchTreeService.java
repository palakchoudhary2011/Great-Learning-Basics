package com.greatlearning.binarysearchtree;

class Node{
	int key;
	Node left;
	Node right;
}
public class BinarySearchTreeService {

	
	static Node newNode(int key) {
		Node temp_node = new Node();
		
		temp_node.key = key;
		temp_node.left = null;
		temp_node.right = null;
		
		return temp_node;
	}
	
	static Node insert(Node root, int key) {
		Node newnode = newNode(key);
		Node temp_root = root;
		Node y = null;
		while (temp_root != null) {
			y = temp_root;
			if (key < temp_root.key)
				temp_root = temp_root.left;
			else if (key > temp_root.key)
				temp_root = temp_root.right;
			else {
				System.out.println("Value already exists!!!");
				return newnode;
				}
			}
		if (y == null) {
			y = newnode;
		}
		else if (key < y.key) {
			y.left = newnode;
		}
		else
		{
			y.right = newnode;
		}
		return y;
		}
	
	static void inorder(Node root) {
		if( root == null) {
			return;
		}
		else {
			inorder(root.left);
			System.out.print(root.key + " :: ");
			inorder(root.right);
		}
	}
	
}
