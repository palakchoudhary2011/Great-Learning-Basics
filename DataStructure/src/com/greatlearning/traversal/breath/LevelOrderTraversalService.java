package com.greatlearning.traversal.breath;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int key;
	Node left;
	Node right;
	
}

public class LevelOrderTraversalService {

	Deque<Node> queue = new LinkedList<Node>();
	
	static Node newNode(int data) {
		Node temp = new Node();
		
		temp.key = data;
		temp.left = null;
		temp.right = null;
		
		return temp;
	}
	
	Node insertNode(Node root, int key) {
		Node temp = newNode(key);
		
		if( root ==null ) {
			root = temp;
			queue.add(root);
			return root;
		}else {
			Node node;
			node = queue.remove();
			System.out.println("Parent key : " + node.key);
			if( node.left == null) {
				node.left = temp;
				queue.add(node.left);
				queue.addFirst(node);
				return root;
			}else if(node.right == null) {
				node.right = temp;
				queue.add(node.right);
				return root;
			}
		}
		return root;
	}
	
	public void levelOrder( Node root) {
		Queue<Node> newQueue = new LinkedList<Node>();
		newQueue.add(root);
		while(!newQueue.isEmpty()) {
			Node tempNode = newQueue.poll();
			System.out.print(tempNode.key + " ");
			// enqueue left node
			if (tempNode.left != null) {
				newQueue.add(tempNode.left);
				}
			// enqueue right node
			if (tempNode.right != null) {
				newQueue.add(tempNode.right);
				}
		}
	}
}
