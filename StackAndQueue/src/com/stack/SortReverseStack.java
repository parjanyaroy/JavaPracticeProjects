package com.stack;

import java.util.Stack;

public class SortReverseStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for (int j = 1; j <= 10; j++)
			{
			s.push((int) (Math.random() * 100));
			//s.push(j);
			}
		System.out.println(s.toString());
		SortReverseStack s1=new SortReverseStack();
		s1.reverseStack(s);
		System.out.println(s.toString());
		s1.sortStack(s);
		System.out.println(s.toString());
		
	}

	void reverseStack(Stack<Integer> s) {
		if (s.isEmpty())
			return;
		else {
			int num = s.pop();
			sortStack(s);
			if (s.isEmpty())
				s.push(num);
			else
				pushAtTheBottom(s, num);
		}
	}

	private void pushAtTheBottom(Stack<Integer> s, int num) {
		if (s.isEmpty())
			s.push(num);
		else {
			int num2 = s.pop();
			pushAtTheBottom(s, num);
			s.push(num2);
		}

	}
	
	
	void sortStack(Stack<Integer> s) {
		if (s.isEmpty())
			return;
		else {
			int num = s.pop();
			sortStack(s);
			if (s.isEmpty())
				s.push(num);
			else
				reverseAtTheBottom(s, num);
		}
	}

	private void reverseAtTheBottom(Stack<Integer> s, int num) {
		if (s.isEmpty() || s.peek()>num)
			s.push(num);
		else {
			int num2 = s.pop();
			reverseAtTheBottom(s, num);
			s.push(num2);
		}

	}

}
