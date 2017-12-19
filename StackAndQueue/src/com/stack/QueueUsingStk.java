package com.stack;

import java.util.Stack;

public class QueueUsingStk {

	Stack<Integer> s1 = new Stack<Integer>();

	int dequeue() {
		if (!s1.isEmpty())
			return s1.pop();
		else
			return Integer.MIN_VALUE;
	}

	void enqueue(int x) {
		if (s1.isEmpty())
			s1.push(x);
		else {
			int num = s1.pop();
			enqueue(x);
			s1.push(num);
		}
	}
	
	int peek()
	{
		if(!s1.isEmpty())
			return s1.peek();
		else
			return Integer.MIN_VALUE;
	}

}
