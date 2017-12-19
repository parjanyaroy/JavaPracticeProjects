package com.proj;

import com.proj.LkdList.Node;

public class LastNRecursion {
	
	Node recursionResult=null;

	public static void main(String args[]) {
		LkdList l1 = new LkdList();
		l1.head = new Node(1);
		Node n2 = new Node(2);
		l1.head.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		l1.addNodeToList(4);
		l1.addNodeToList(5);
		l1.printList();
		Node result = null;
		LastNRecursion l2= new LastNRecursion();
		l2.getLastN(5 ,l1.head,result);
		System.out.println("Last N::"+l2.recursionResult.data);
		l1.printList();

	}

	public Node getLastN(int n, Node head,Node result) {
		this.recursionResult=null;
		if(head==null || n<1)
			return null;
		Node ptr = head;
		returnLastN(n, ptr,result);
		return result;
	}

	private int returnLastN(int n, Node ptr, Node result) {
		if (ptr == null) {
			return 0;
		} else {
			int res = 1 + returnLastN(n, ptr.next,result);
			if (res == n && result==null) {
				result = ptr;
				this.recursionResult=ptr;
				return res;
			} else {
				return res;
			}
		}
	}

}
