package com.heap;

public class CheckValidHeap {
	/*
	 * JUST CHECK THAT CURRENT ELEMENT IS LESSER THAN LEFT CHILD AND RIGHT CHILD
	 * AND RECURSIVELY CALL THE FUNCTION FOR LEFT CHILD AND RIGHT CHILD
	 */
	static boolean isHeapValid(int i,BinaryHeap b1)
	{
		if(i>((b1.count-1)/2))
			return true;
		else
		{
			return b1.arr[i]<b1.arr[b1.getLeft(i)] 
					&& b1.arr[i]<b1.arr[b1.getRight(i)] 
							&& isHeapValid(b1.getLeft(i), b1)
						&& isHeapValid(b1.getRight(i), b1); 
		}
		
	}
	
}
