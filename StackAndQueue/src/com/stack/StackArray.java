package com.stack;

public class StackArray {

	int[] arr;
	int max_Size = 0;
	int top = -1;
	
	public int peek()
	{
		if(!isStackEmpty())
		return arr[top];
		
		return -1;
	}

	public StackArray(int n) {
		arr = new int[n];
		this.max_Size = n;
	}

	void push(int data) throws StackOverUnderFlow {
		if (top < (max_Size - 1)) {
			arr[++top] = data;
		} else {
			System.out.println(" Stack is Full!! ");
		}
	}

	int pop() throws StackOverUnderFlow {
		if (top > -1) {
			int data = arr[top];
			top--;
			return data;
		} else
			System.out.println(" Stack is Empty!! ");
		return -1;
	}
	boolean isStackEmpty()
	{
		return top==-1;
	}
}
