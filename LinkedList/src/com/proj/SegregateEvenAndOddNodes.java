package com.proj;

import com.proj.LkdList.Node;

public class SegregateEvenAndOddNodes {

	public static void main(String[] args) {
		SegregateEvenAndOddNodes s1 = new SegregateEvenAndOddNodes();
		LkdList l1 = new LkdList();
		l1.head = new Node(1);
		//for(int j=2;j<3;j++)
		//l1.addNodeToList(j);
		
		Node evenListHead =s1.splitEvenOdd(l1.head);
		l1.printList();
		l1.printList(evenListHead);
		
	}
	
	public Node splitEvenOdd(Node head)
	{
		Node oddNode = head;
		Node evenNode = head.next;
		if(oddNode.next==null)
		{
			return null;
		}
		else if(null==evenNode.next)
		{
			oddNode.next=null;
			return evenNode;
		}
		Node n1= oddNode;
		Node n2 = evenNode;
		while(null!=n2.next && null!=n2.next.next)
		{
			Node temp=n2.next;
			n1.next = temp;
			n2.next= temp.next;
			n1=n1.next;
			n2=n2.next;
		}
		if(n2.next!=null)
		{	
			n1.next=n2.next;
			n2.next=null;
		}
		
		return evenNode;
		
		
	}
	
}
