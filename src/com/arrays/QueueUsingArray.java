package com.arrays;

public class QueueUsingArray {
	
	static int[] queue;
	static int rear = 0;
	static int front = 0;
	static int size;
	
	QueueUsingArray(int size){
		queue = new int [size];
		this.size = size;
	}
	
	void push (int x) {
		if(rear==size) {
			System.out.println("Queue is full");
		}else {
			queue[rear++] = x;
		}
	}
	
	public int pop() {
		
		if(front==rear) {
			return -1;
		}else {
			int poppedElement = queue[front++];
			return poppedElement;
		}
		
	}

}
