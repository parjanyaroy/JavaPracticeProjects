package com.proj;

import com.proj.LkdList.Node;

public class DeleteGreaterNode {
	
	// Delete Node with a greater value on the right side
		
			
	public static void main(String[] args) {
	
		LkdList l1 = new LkdList();
		l1.head = new Node(1);
		l1.addNodeToList(2);
		l1.addNodeToList(3);
		l1.addNodeToList(6);
		l1.addNodeToList(5);
		l1.addNodeToList(6);
		l1.addNodeToList(7);
		l1.head = (new DeleteGreaterNode()).deleteNodeWithGreaterRight(l1.head);
		l1.printList();
		
	
	}
	
	public Node deleteNodeWithGreaterRight(Node head)
	{
		Node dummyHead = new Node(-1);
		Node n1= head;
		dummyHead.next=n1;
		Node prev=dummyHead;
		while(n1!=null && null!=n1.next)
		{
			if(n1.next.data>n1.data)
			{
				prev.next=n1.next;
				n1=prev.next;
			}
			else
			{
				prev=n1;
				n1=n1.next;
			}
			
		}
		return dummyHead.next;
		
	}
	

}
