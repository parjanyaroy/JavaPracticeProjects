package com.stack;

public class QueueArray {

	int[] arr;
	int max_size = 0;
	int front = -1;
	int rear = -1;

	public QueueArray(int n) {
		arr = new int[n];
		this.max_size = n;
	}
	// Elements are dequeued from the front and enqueued from the rear;

	void enqueue(int data){
		if(rear==-1 && front==-1)
		{
			arr[0]=data;
			rear++;
			front++;
		}
		else if (rear + 1 != max_size && rear + 1 != front) {
			arr[rear + 1] = data;
			rear++;
		} else if (rear + 1 == max_size && front > 0) {
			arr[0] = data;
			rear = 0;
		} else {
			//throw new QueueExceptions("Queue Is Full");
			System.out.println("Queue Is Full");
		}

	}

	int dequeue() {
		if (front == rear && front!=-1) // For Last Queue Eleent
		{
			int x = arr[front];
			front = -1;
			rear = -1;
			return x;
		} else if (front == -1 && rear == -1) // For Empty Queue
		{
			System.out.println("Queue Is Empty");
			return -1;
		} else if ((front + 1) == max_size) // For front reaching end of array
		{
			int x = arr[front];
			front = 0;
			return x;
		} else {
			int x = arr[front];
			front++;
			return x;
		}

	}

	int peek() {

		if (front != -1)
			return arr[front];
		else
			System.out.println("Queue Is Empty");
		return -1;
	}

	boolean isQueueEmpty() {
		return (front == -1 && rear == -1);

	}

	boolean isQueueFull() {
		return ((front + 1 == rear || (front + 1 == max_size && rear == 0)));

	}

	void printQueue() {
		int f = front;
		int r = rear;
		System.out.println();
		System.out.print("Rear--> ");
		if (!isQueueEmpty())
			do {

				if (r== 0 && f!=r) {
					System.out.print(arr[r]+" ");
					r = max_size-1;
				}
				else if (f == r) {
					System.out.print(arr[r]+" ");
					f = -1;
					r = -1;
				} else
					System.out.print(arr[r]+" ");
					r--;

			} while (f != -1 && r != -1);
		System.out.print(" -->Front");

	}

}
