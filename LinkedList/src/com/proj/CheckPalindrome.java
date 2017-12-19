package com.proj;

import com.proj.LkdList.Node;

public class CheckPalindrome {
	
	Node head=null;
	Node middleNode=null;
	
	public static void main(String args[]) {
		LkdList l1 = new LkdList();
		l1.head = new Node(1);
		l1.addNodeToList(2);
		l1.addNodeToList(1);
		/*l1.addNodeToList(4);
		l1.addNodeToList(3);
		l1.addNodeToList(2);
		l1.addNodeToList(1);*/
		CheckPalindrome cP = new CheckPalindrome();
		cP.head=l1.head;
		cP.findMiddleOfList();
		l1.printList();
		System.out.println("Middle "+cP.middleNode.data);
		cP.middleNode.next=cP.reverseListFromMiddle();
		l1.printList();
		System.out.println("Palindrome Check : "+cP.checkPalindromeScan());
		cP.middleNode.next=cP.reverseListFromMiddle();
		l1.printList();
		}
	
	void findMiddleOfList()
	{
		this.middleNode=null;
		Node slowptr=head;
		Node fastptr=head;
		while(fastptr.next!=null && fastptr.next.next!=null){
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		this.middleNode=slowptr;
	}
	
	Node reverseListFromMiddle()
	{
			Node ptr = middleNode.next;
			Node prev=null;
			Node next=null;
			while(ptr!=null)
			{
				next=ptr.next;
				ptr.next=prev;
				prev=ptr;
				ptr=next;;
			}
			return prev;
	}
	
	boolean checkPalindromeScan()
	{
		Node firstPtr=head;
		Node secondPtr=middleNode.next;
		while(firstPtr!=null && secondPtr!=null)
		{
			if(firstPtr.data!=secondPtr.data)
				return false;
			firstPtr=firstPtr.next;
			secondPtr=secondPtr.next;
		}
		return true;
	}
	
	
	
	
	
}
