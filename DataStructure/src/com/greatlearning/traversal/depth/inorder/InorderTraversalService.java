package com.greatlearning.traversal.depth.inorder;


class Node{
	int key;
	Node left;
	Node right;
}
public class InorderTraversalService {

	
	static Node newNode(int data) {
		Node temp = new Node();
		
		temp.key = data;
		temp.left = null;
		temp.right = null;
		
		return temp;
	}
	
	public void inorder(Node root) {
		if( root == null) {
			return;
		}
		else {
			inorder(root.left);
			
			System.out.print(root.key + " : ");
			
			inorder(root.right);
		}
	}
}
