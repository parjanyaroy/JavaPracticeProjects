package com.proj;

public class FlattenLinkedList {

	static class MultiNode {
		int data;
		MultiNode right = null;
		MultiNode down = null;

		MultiNode(int data) {
			this.data = data;
			this.right=null;
			this.down=null;
		}

		MultiNode(int data, MultiNode down, MultiNode right) {
			this.data = data;
			this.right = right;
			this.down = down;
		}

		MultiNode(int data, MultiNode down) {
			this.data = data;
			this.down = down;
			this.right=null;
		}
	}

	MultiNode root = null;

	public static void main(String[] args) {
		
		MultiNode m45 = new MultiNode(45);
		MultiNode m40 = new MultiNode(40, m45);
		MultiNode m35 = new MultiNode(35, m40);
		MultiNode m28 = new MultiNode(28, m35);
		
		MultiNode m50 = new MultiNode(50);
		MultiNode m22 = new MultiNode(22, m50);
		MultiNode m19 = new MultiNode(19, m22, m28);

		MultiNode m20 = new MultiNode(20);
		MultiNode m10 = new MultiNode(10, m20, m19);

		MultiNode m30 = new MultiNode(30);
		MultiNode m8 = new MultiNode(8, m30);
		MultiNode m7 = new MultiNode(7, m8);
		MultiNode m5 = new MultiNode(5, m7, m10);
		
		
		MultiNode head = m5;
		MultiNode m1 = (new FlattenLinkedList()).flattenList(head);
		while(m1!=null)
		{
			System.out.print(m1.data+" ");
			m1=m1.down;
		}
		

	}
	
	MultiNode flattenList(MultiNode root)
	{
		MultiNode list1=root;
		MultiNode list2=null;
		if(root.right==null)
			return list1;
		
		while(list1.right!=null)
		{
			MultiNode temp=list1.right.right;
			list2=list1.right;
			MultiNode newList=mergeList(list1,list2);
			list1=newList;
			list1.right=temp;
		}
		
		return list1;
	}
	
	public MultiNode mergeList(MultiNode listA,MultiNode listB)
	{
		MultiNode mergeList=null;
		if(listA==null)
			return listB;
		if(listB==null)
			return listA;
		else
		{
		if(listB.data<listA.data)
		{	mergeList=listB;
			mergeList.down=mergeList(listA,listB.down);
			mergeList.right=null;
		}
		else
		{
			mergeList=listA;
			mergeList.down=mergeList(listA.down,listB);
			mergeList.right=null;
		}
		}
		
		
		return mergeList;
	
	}	
	

}
