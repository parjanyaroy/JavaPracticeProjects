package com.proj;

import com.proj.LkdList.Node;
// Add one (+1) To a number represented by a linked list recursively
public class AddOneToListNumber {

	public static void main(String[] args) {
		LkdList l1 = new LkdList(new int[]{7,8,9});
		AddOneToListNumber a1 = new AddOneToListNumber();
		Node n1=a1.addOneCaller(l1.head);
		l1.printList(n1);

	}
	
	public Node addOneCaller(Node list)
	{
		int x=addOne(list);
		if(x>0)
		{
			Node newHead= new Node(x);
			newHead.next=list;
			return newHead;
		}
		else
			return list;
	}
	
	private int addOne(Node list)
	{
		if(list.next==null)
		{
			int sum=list.data+1;
			list.data=sum%10;
			return sum/10;
		}
		else
		{
			int num=addOne(list.next);
			int sum=list.data+num;
			list.data=sum%10;
			return sum/10;
		}
		
	}

}
