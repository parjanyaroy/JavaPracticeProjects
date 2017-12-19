package com.proj;

import com.proj.LkdList.Node;

public class ReverseKNodes {
	
	Node head = null ;
	Node ptr=null;
	public static void main(String[] args) {
		LkdList l1 = new LkdList();
		for(int i=1;i<=20;i++)
			l1.addNodeToList(i);
		ReverseKNodes r1 = new ReverseKNodes();
		r1.head=l1.head;
		l1.printList();
		r1.reverseKItems(15);
		l1.head=r1.head;
		l1.printList();
		r1.reverseKItems(15);
		l1.head=r1.head;
		l1.printList();
		
				
	}
	
	void reverseKItems(int k)
	{
		Node ptr=head;
		Node prevBlockTail=null;
		Node finalHead = null;
		do
		{
		Node prev=null;
		Node temp=null;
		int j=k;
		Node tempHead = ptr;
		while(ptr!=null && j>0)
		{
			temp=ptr.next;
			ptr.next=prev;
			prev=ptr;
			ptr=temp;
			j--;
		}
		if(prevBlockTail==null)
		finalHead=prev;
		else
		prevBlockTail.next=prev;
		prevBlockTail=tempHead;
		}
		while(ptr!=null);
		this.head=finalHead;
	}

}
