package com.proj;

import com.proj.LkdList.Node;

public class FindSumFromTwoLists {
	
	// Two linked lists are provided . Find the number pairs one from each list that add upto a given total.
	
	public static void main(String[] args) {
		int [] arr1 ={4,3,8,3,1,9,5,6,0,3};
		LkdList l1 = new LkdList(arr1);
		int [] arr2 ={5,7,2,0,2,5,0,5,2,7,9,2,1,7,4};
		LkdList l2 = new LkdList(arr2);
		FindSumFromTwoLists fs = new FindSumFromTwoLists();
		Node fistList = l1.doMergeSort(l1.head, true);
		Node secondList = l1.doMergeSort(l2.head, false);
		l1.printList(fistList);
		System.out.println();
		l1.printList(secondList);
		fs.findPairWithSum(10, fistList, secondList);
		System.out.println();
	}
	
	public void findPairWithSum(int sum,Node list1,Node list2)
	{
		System.out.println("Sum :"+sum);
		while(list1.next!=null && list2.next!=null)
		{
			if(list1.data+list2.data==sum)
			{
				System.out.println(list1.data+" "+list2.data);
				list1=list1.next;
				list2=list2.next;
			}
			else if(list1.data+list2.data>sum)
			{
				list2=list2.next;
			}
			else if(list1.data+list2.data<sum)
			{
				list1=list1.next;
			}
		}
		System.out.println("----------------------------------");
	}

}
