package com.greatlearning.linear;

class Node{
	public int nodeData;
	public Node nextNode;
}

public class SinglyLinedListLinerDataStructure {

	public Node head;
	
	// Insert at first position of list
	public void insertAtFirst(int value) {
		Node node = new Node();
		node.nodeData = value;
		node.nextNode = head;
		head = node;
	}
	// Insert at Last position of list	
	public void insertAtLast(int value) {
		Node currentNode = head;
		while( currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}
		// creating new node
		Node node = new Node();
		node.nodeData = value;
		currentNode.nextNode = node;
	}
	// Insert at first position of list
	public void insertAtPos(int value, int pos) {
		Node currentNode = head;
		for( int i = 0; i< pos-1; i++) {
			currentNode = currentNode.nextNode;
		}
		
		Node tempNode = currentNode;
		currentNode = currentNode.nextNode;
		
		Node node = new Node();
		node.nodeData = value;
		tempNode.nextNode = node;
		node.nextNode = currentNode;
		
	}
	
	// Delete First node
	public void deleteFirst() {
		head = head.nextNode;
	}
	// Delete last node 
	public void deleteLast() {
		Node currentNode = head;
		while( currentNode.nextNode != null ) {
			currentNode = currentNode.nextNode;
		}
		
		currentNode.nextNode = null;
	}
	// Delete Node on position
	public void deleteAtPos(int pos) {
		Node currentNode = head;
		for( int i = 0; i< pos -1 ; i++) {
			currentNode = currentNode.nextNode;
		}
		
		Node tempNode = currentNode.nextNode.nextNode;
		currentNode.nextNode = tempNode;
		
	}
	
	public void showList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.nodeData + "-->");
			currentNode = currentNode.nextNode;
		}
		System.out.print("Null");
		System.out.println();
	}
	
	public static void main(String args[]) {
		SinglyLinedListLinerDataStructure single = new SinglyLinedListLinerDataStructure();
		
		System.out.println("Insertion : ");
		single.insertAtFirst(30);
		single.insertAtFirst(20);
		single.insertAtFirst(10);
		
		single.showList();
		
		single.insertAtLast(40);
		single.showList();
		
		single.insertAtPos(25, 2);
		single.showList();
		
		System.out.println("Deletion ");
		
		single.deleteFirst();
		single.showList();
		single.deleteLast();
		single.showList();
		single.deleteAtPos(1);
		single.showList();
	}
}
