package com.heap;

public class HeapTest {

	public static void main(String[] args) {
		BinaryHeap b1 = new BinaryHeap(30);
		//b1.printHeap();
		int arr[]= new int[]{2 ,46 ,31 ,50 ,59 ,38 ,99 ,98,72 };
		for (int j = 0; j < 9; j++) {
		{
			//b1.insert((int)(Math.random()*100));
			b1.insert(arr[j]);
		}
			
		}
		b1.printHeap();
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		System.out.println("Get Min:"+b1.extractMin());
		b1.printHeap();
		System.out.println("Is Heap Valid :"+CheckValidHeap.isHeapValid(0, b1));
		System.out.println("----------------------------");
		
		 
		 
	}

}
