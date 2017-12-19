package com.stack;

import java.util.concurrent.ThreadLocalRandom;

public class StockSpanProblem {

	public static void main(String[] args) throws StackOverUnderFlow {
		StackArray s1 = new StackArray(10);
		int stockval [] = new int[10];
		int stockspan [] = new int[10];
		for(int i=0;i<10;i++)
			stockval[i]=ThreadLocalRandom.current().nextInt(1,6);
		//stockval =new int[] {1,8,4,3,5,7,2,4,6,9};
		s1.push(1);
		stockspan[0]=1;
		
		for(int j=1;j<10;j++)
		{
			while(!s1.isStackEmpty() && stockval[s1.peek()]<=stockval[j])
			{
				s1.pop();
			}
			stockspan[j]=s1.isStackEmpty()?j+1:j-s1.peek();
			s1.push(j);
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(stockval[i]+" "+stockspan[i]);
		}
	}
	
}
