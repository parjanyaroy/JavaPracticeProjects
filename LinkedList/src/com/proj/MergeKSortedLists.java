package com.proj;

import com.proj.LkdList.Node;

// Merge K Sorted Lists

public class MergeKSortedLists {
	
	public static void main(String[] args) {
		LkdList l1 = new LkdList(new int[]{1,6,11});
		LkdList l2 = new LkdList(new int[]{2,7,12});
		LkdList l3 = new LkdList(new int[]{3,8,13});
		LkdList l4 = new LkdList(new int[]{4,9,14});
		LkdList l5 = new LkdList(new int[]{5,10,15});
		
		Node[] node = new Node[]{l1.head,l2.head,l3.head,l4.head,l5.head};
		MergeKSortedLists mk = new MergeKSortedLists();
		Node n1=mk.mergeKLists(node);
		l1.printList(n1);
	}
	
	
	public Node mergeKLists(Node[] nodeContainer)
	{
		int k = nodeContainer.length;
		int i=0;
		while(k>1)
		{
			i=0;
			int j=k-1;
			int ctr=0;
			while(i<j)
			{
				ctr++;
				nodeContainer[i]=(new LkdList()).mergeList(nodeContainer[i], nodeContainer[j]);
				i++;
				j--;
			}
			k=k-ctr;
			ctr=0;
			
		}
		return nodeContainer[0];
	}

}
