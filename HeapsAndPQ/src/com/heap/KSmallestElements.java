package com.heap;

public class KSmallestElements {

	public static void main(String[] args) {
		int arr[]= new int[30];
		for(int i=0;i<30;i++)
		{
			arr[i]=((int)(Math.random()*100));
		}
		BinaryHeap b1= new BinaryHeap(30);
		for(int i : arr)
		{
			b1.insert(i);
		}
		
		
		b1.printHeap();
		System.out.println("Smallest 4 elemests are :");
		System.out.println(b1.extractMin());
		System.out.println(b1.extractMin());
		System.out.println(b1.extractMin());
		System.out.println(b1.extractMin());
		
		
	}
	
}
