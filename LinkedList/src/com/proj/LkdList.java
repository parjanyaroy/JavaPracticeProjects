package com.proj;

public class LkdList
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
	
	public LkdList(int arr[]) {
		for(int i : arr)
		{
			addNodeToList(i);
		}
	}
	
	public LkdList()
	{
		
	}
	
	public static void main(String args[])
	{
		LkdList l1= new LkdList();
		l1.head = new Node(1);
		Node n2= new Node(2);
		l1.head.next=n2;
		Node n3= new Node(3);
		n2.next=n3;
		l1.addNodeToList(4);
		l1.addNodeToList(5);
		l1.printList();
		/*l1.head=l1.reverseList();
		l1.printList();*/
		l1.head=l1.reversePair();
		l1.printList();
		
	}
	
	public Node reversePair()
	{
		// Assign ptr to begining of the list 
		Node ptr = head;
		// Create a new head
		Node newHead = null;
		if(ptr==null)
			return null;
		if(ptr.next==null)
			return ptr;
		
		Node prev=null;
		Node nodeA=null;
		Node nodeB=null;
		while(null!=ptr)
		{
			/*
			 * 1->2->3->4
			 * 
			 * A -1
			 * B -2
			 * temp - B.next - 3
			 * swap A and B 
			 * if this is the first set of nodes then set B as the new head
			 * else provide linkage to previous
			 */
			if(ptr.next!=null)
			{
			nodeA=ptr;
			nodeB=ptr.next;
			Node temp=nodeB.next;
			nodeB.next=nodeA;
			nodeA.next=temp;
			if(prev!=null)
				prev.next=nodeB;
			else
				newHead=nodeB;
			prev=nodeA;
			ptr=temp;
			}
			else
			{
				break;
			}
		}
		return newHead;
		
	}
	
	public void printList()
	{
		Node pointr = head;
		System.out.println();
		while(pointr!=null)
		{
			System.out.print(pointr.data+" ");
			pointr=pointr.next;
		}
		System.out.println();
		System.out.println("=========================");
	}
	
	public void printList(Node n1)
	{
		Node pointr = n1;
		System.out.println();
		while(pointr!=null)
		{
			System.out.print(pointr.data+" ");
			pointr=pointr.next;
		}
		System.out.println();
		System.out.println("=========================");
	}
	
	public void addNodeToList(int data)
	{
		Node pointr = head;
		if(head==null)
		{
			this.head= new Node(data);
			return;
		}
		while(pointr.next!=null)
		pointr=pointr.next;
		Node newNode=new Node(data);
		pointr.next=newNode;
	}
	
	public Node reverseList()
	{
		Node ptr = head;
		Node prev=null;
		Node next=null;
		while(ptr!=null)
		{
			//System.out.println("prev "+(prev==null?null:prev.data)+" curr "+ptr.data+" next "+(next==null?null:next.data));
			next=ptr.next;
			ptr.next=prev;
			prev=ptr;
			ptr=next;;
		}
		return prev;
	}
	
	public Node reverseList(Node head)
	{
		Node ptr = head;
		Node prev=null;
		Node next=null;
		while(ptr!=null)
		{
			//System.out.println("prev "+(prev==null?null:prev.data)+" curr "+ptr.data+" next "+(next==null?null:next.data));
			next=ptr.next;
			ptr.next=prev;
			prev=ptr;
			ptr=next;;
		}
		return prev;
	}
	
	// SORTING OF A LINKED LIST WITH MERGE SORT
	
	
	
	public Node doMergeSort(Node head,boolean ascending)
	{	// Just a simple utility to decide whether its an ascending sort or a descending sort
		if(ascending)
		{
			return mergeSort(head);
		}
		else
		{
			Node Newhead= mergeSort(head);
			return reverseList(Newhead);
		}
	}
	
	private Node mergeSort(Node head) // FUNCTION SIGNATURE : ONLY ONE PARAMETER
	{
		Node mergedList=null;
		if(head==null || head.next==null)
		{
			return head;
		}
		else
		{
			Node temp = findMiddle(head);
			Node listB = temp.next;
			temp.next=null;
			Node list1=mergeSort(head);
			Node list2=mergeSort(listB);
			mergedList = mergeList(list1, list2); // ONLY TWO PARAMETER
		}
		return mergedList;
	}
	
	private Node findMiddle(Node head)
	{
		if(head==null || head.next==null)
			return head;
		if(head.next.next==null)
		{
			return head;
		}
		Node slowPtr=head;
		Node fastPtr=head.next;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
		
	}
	
	public Node mergeList(Node listA,Node listB)
	{
		Node mergeList=null;
		if(listA==null)
			return listB;
		if(listB==null)
			return listA;
		else
		{
		if(listB.data<listA.data)
		{	mergeList=listB;
			mergeList.next=mergeList(listA,listB.next);
		}
		else
		{
			mergeList=listA;
			mergeList.next=mergeList(listA.next,listB);
		}
		}
		return mergeList;
	
	}	
	
}