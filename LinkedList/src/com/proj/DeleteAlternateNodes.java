package com.proj;

import com.proj.LkdList.Node;

public class DeleteAlternateNodes {
	
	Node head = null; 
	
	public static void main(String[] args) {
		LkdList l1 = new LkdList();
		l1.addNodeToList(1);
		/*l1.addNodeToList(2);
		l1.addNodeToList(3);
		l1.addNodeToList(4);
		l1.addNodeToList(5);
		l1.addNodeToList(6);*/
		l1.printList();
		DeleteAlternateNodes d1 = new DeleteAlternateNodes();
		d1.head=l1.head;
		d1.deleteAlternateNodes();
		l1.printList();
	}
	/* SIMPLE LOGIC . JUST SET NEXT POINTER TO NEXT.NEXT . CHECK EXISTS BEFORE SETTING*/
	void deleteAlternateNodes()
	{
		Node ptr=head;
		while(ptr!=null && ptr.next!=null)
		{
			ptr.next=ptr.next.next;
			ptr=ptr.next;
		}
	}

}
