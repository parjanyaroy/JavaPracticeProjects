package com.proj;

import java.util.HashMap;

public class CloneList {

	// Given A Linked List with data , pointer to a next node and a random node
	// 1>Make The Random Pointer Point to the next highest node
	// 2>Clone the list

	static class TwoPtrList {
		int data;
		TwoPtrList rand;
		TwoPtrList next;

		public TwoPtrList(int data) {
			this.data = data;
			rand = null;
			next = null;
		}
	}

	TwoPtrList head = null;

	public static void main(String[] args) {

		CloneList c1 = new CloneList();
		TwoPtrList t1 = c1.generateList(c1.head, 10);
		c1.printList(t1, true);
		c1.copyNodeToRand(t1);
		System.out.println();
		TwoPtrList orginalHead = t1;
		TwoPtrList finalList = c1.mergeSortPartition(t1);
		c1.printList(orginalHead, true);
		TwoPtrList clonedList=c1.cloneCurrentList(orginalHead);
		c1.printList(clonedList, true);

	}

	public void copyNodeToRand(TwoPtrList head) {
		TwoPtrList n1 = head;
		while (n1 != null) {
			n1.rand = n1.next;
			n1 = n1.next;
		}
	}

	TwoPtrList mergeSortPartition(TwoPtrList head) {
		if (null == head || null == head.rand) {
			return head;
		} else {
			TwoPtrList temp = findMiddle(head);
			TwoPtrList b = temp.rand;
			temp.rand = null;
			/*
			 * System.out.println("Partition"); printList(head, false);
			 * printList(b, false);
			 * System.out.println("\n---------------------");
			 */
			TwoPtrList leftList = mergeSortPartition(head);
			TwoPtrList rightList = mergeSortPartition(b);
			TwoPtrList mergedList = mergePartitions(leftList, rightList);
			return mergedList;

		}
	}

	private TwoPtrList mergePartitions(TwoPtrList a, TwoPtrList b) {
		TwoPtrList mergedList = new TwoPtrList(-1);
		/*
		 * System.out.println("Merging "); printList(a, false); printList(b,
		 * false); System.out.println("\n---------------------");
		 */
		if (a == null)
			return b;
		else if (b == null)
			return a;

		if (a.data > b.data) {
			mergedList = b;
			b.rand = mergePartitions(a, b.rand);
		} else {
			mergedList = a;
			a.rand = mergePartitions(a.rand, b);
		}

		return mergedList;

	}

	TwoPtrList findMiddle(TwoPtrList node) {
		if (node == null || node.rand == null) {
			return node;
		} else if (node.rand.rand == null) {
			return node;
		}
		TwoPtrList fastPtr = node.rand;
		TwoPtrList slowPtr = node;
		while (null != fastPtr && null != fastPtr.rand) {
			slowPtr = slowPtr.rand;
			fastPtr = fastPtr.rand.rand;
		}
		return slowPtr;

	}

	public TwoPtrList generateList(TwoPtrList head, int elements) {

		// head = new TwoPtrList(((int) (Math.random() * 100)));
		/*
		 * head = new TwoPtrList(1); TwoPtrList n1 = head; if (elements < 2)
		 * return head; for (int i = elements; i >= 2; i--) { n1.next = new
		 * TwoPtrList(((int) (Math.random() * 100))); n1.next = new
		 * TwoPtrList(i); n1 = n1.next; }
		 */

		TwoPtrList t1 = null;
		if (t1 == null)
			t1 = new TwoPtrList(10);
		head = t1;
		for (int j = 9; j >= 1; j--) {
			t1.next = new TwoPtrList((int) (Math.random() * 100));
			t1 = t1.next;
		}

		return head;
	}

	public void printList(TwoPtrList head, boolean isNext) {
		System.out.println();
		TwoPtrList n1 = head;
		if (isNext) {
			while (n1 != null) {
				System.out.print(n1.data + " ");
				n1 = n1.next;
			}
		} else {
			while (n1 != null) {
				System.out.print(n1.data + " ");
				n1 = n1.rand;
			}
		}
	}

	public TwoPtrList cloneCurrentList(TwoPtrList head) {
		HashMap<TwoPtrList,TwoPtrList> storeMap = new HashMap<>();
		TwoPtrList newListHead=null;
		TwoPtrList head1=head;
		while(head1!=null)
		{
			storeMap.put(head1, new TwoPtrList(head1.data));
			head1=head1.next;
		}
		head1=head;
		while(head1!=null)
		{
			storeMap.get(head1).next=storeMap.get(head1.next);
			storeMap.get(head1).rand=storeMap.get(head1.rand);
			head1=head1.next;
		}
		return storeMap.get(head);
	}

}
