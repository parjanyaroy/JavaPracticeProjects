package com.stack;

import java.util.Stack;

public class NextGreaterElement {

		
	public static void main(String[] args) {
		int[] arr = new int[]{11,13,12,9,10,21};
		(new NextGreaterElement()).printNextGreater(arr);

	}
	
	void printNextGreater(int []arr)
	{
		Stack<Integer> s1= new Stack<Integer>();
		s1.push(arr[0]);
		for(int j=1;j<arr.length;j++)
		{
			int next=arr[j];
			if(!s1.isEmpty())
			{
				int element=s1.pop();
				while(element<next)
				{
					System.out.println("Elem->"+element+" NGE-> "+next);
					if(s1.isEmpty())
						break;
					element=s1.pop();
				}
				if(element>next)
					s1.push(element);
			}
			else
				s1.push(next);
		}
		
	}

}
