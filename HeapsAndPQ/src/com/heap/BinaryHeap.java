package com.heap;

import java.util.Arrays;

public class BinaryHeap {
	
	int arr[];
	int nElements;
	int count;
		
	public BinaryHeap(int nElements) {
		super();
		arr = new int[nElements];
		this.nElements = nElements;
		this.count = -1;
		Arrays.fill(arr,Integer.MAX_VALUE);
		
	}
	
	boolean isEmpty()
	{
		return count==-1;
	}
	
	boolean isFull()
	{
		return count==(nElements-1);
	}
	
	int getMin()
	{
		if(!isEmpty())
		{
			return arr[0];
		}
		else
			return Integer.MAX_VALUE;
	}
	
	int getLeft(int indexI)
	{
		return 2*indexI+1;
	}
	int getRight(int indexI)
	{
		return 2*indexI+2;
	}
	
	int getParent(int indexI)
	{
		return (indexI-1)/2;
	}
	
	void swap(int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	int getSmallestChild(int i)
	{
		return arr[getLeft(i)]<arr[getRight(i)]?(2*i+1):(2*i+2);
	}
	
	int extractMin()
	{
		if(!isEmpty())
		{
			int x= arr[0];
			arr[0]=arr[count];
			arr[count]=Integer.MAX_VALUE;
			count--;
			heapifyDown(0);
			return x;
			
		}
		else
		{
			System.out.println("Heap is empty");
			return Integer.MAX_VALUE;
		}
	}
		
	private void heapifyDown(int i) {
		while(i<=((count-1)/2) && arr[getSmallestChild(i)]<arr[i])
		{
			int j=getSmallestChild(i);
			swap(i,j);
			i=j;
		}
	}
	
	void insert(int x)
	{
		if(!isFull())
		{
			arr[++count]=x;
			heapifyUp(count);
		}
		else
		{
			System.out.println("Heap Full !!");
		}
	}


	private void heapifyUp(int i) {
		if(i==0)
			return;
		else
		{
		while(arr[getParent(i)]>arr[i])
		{
			swap(getParent(i),i);
			i=getParent(i);
		}
		}
	}
	
	void printHeap()
	{	System.out.println("Heap: ");
		for(int i : arr)
			if(i!=Integer.MAX_VALUE)System.out.print(i+" ");
		System.out.println();
	}

}
