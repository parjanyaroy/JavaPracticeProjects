package com.heap;

import java.util.Random;

public class ConnectNRopes {
	
	public static void main(String[] args) {
		
		int arr[]=new int[]{4, 3, 2, 6};
		BinaryHeap b1 = new BinaryHeap(arr.length);
		for(int i : arr)
		{
			b1.insert(i);
		}
		int res=0;
		while(b1.count>0)
		{
			int min1 = b1.extractMin();
			int min2 = b1.extractMin();
			res=min1+min2;
			b1.insert(min1+min2);
		}
		
		System.out.println("Minimum Cost Of Connecting the ropes "+res);
		Random r1 = new Random();
		System.out.println(r1.hashCode());
		System.out.println(System.identityHashCode(r1));
		
		
	}

}
