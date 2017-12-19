package com.heap;

public class HeapSort {
	
	public static void main(String[] args) {
		
		int arr[]=new int[]{3,6,2,9,5,7,3,9,3,4};
		BinaryHeap b1 = new BinaryHeap(arr.length);
		for(int i : arr)
		{
			b1.insert(i);
		}
		int ctr=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			int min = b1.extractMin();
			b1.arr[ctr]=min;
			ctr--;
		}
		
		b1.printHeap();
			
		
		
				
	}

}
