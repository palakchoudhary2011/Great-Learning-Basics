package com.greatlearning.linear;

public class QueueLinearDataStructure {

	public int queueSize;
	int front;
	int rear;
	int array[];
	
	public  QueueLinearDataStructure(int size) {
		queueSize = size;
		front = -1;
		rear = -1;
		array = new int[queueSize];
	}
	
	boolean isFull() {
		if( rear == queueSize - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isEmpty() {
		if( front == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue(int data) {
		if( !isFull()) {
			rear++;
			array[rear] = data;
			System.out.println("Inserted " + array[rear]);
			if( front == -1) {
				front = 0;
			}
		}
		else {
			System.out.println("Queue is Overflow");
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is underflow");
		}
		else {
			System.out.println("deleted "+ array[front]);
		}
		if( front == rear) {
			front = -1;
			rear = -1;
		}
		else {
			front++;
		}
	}
	
	public static void main(String args[]) {
		QueueLinearDataStructure queue = new QueueLinearDataStructure(4);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	
		
	}
}
