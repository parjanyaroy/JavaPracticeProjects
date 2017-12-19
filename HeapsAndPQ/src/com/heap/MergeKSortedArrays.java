package com.heap;
// INCOMPLETE PROGRAM
import java.util.Arrays;

public class MergeKSortedArrays {
	 
	public static void main(String[] args) {
	int arr[][] = {	{1,5,9},
					{2,6,10},
					{3,7,11},
					{4,8,12,13}};
	MergeKSortedArrays m1 = new MergeKSortedArrays();
	m1.mergeKSortedArray(arr);
	
	}
	
	int[] mergeKSortedArray(int arr[][])
	{
		int finalSize=arr.length*(arr[0].length);
		int resArr[]=new int[finalSize];
		int ctr=0;
		int[] arrCtr= new int[arr.length];
		Arrays.fill(arrCtr, 0);
		BinaryHeap b1 = new BinaryHeap(arr.length);
		while(ctr<finalSize)
		{
			(int i=1;i<arr.length;i++)
			{
				int element=arr[i][arrCtr[i]];
				b1.insert(element);
			}
			int res=b1.extractMin();
			arr[]
			resArr[ctr]=res;
			ctr++;
		}
		
	}

}
