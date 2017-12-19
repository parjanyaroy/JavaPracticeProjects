package com.proj;

import com.proj.LkdList.Node;

// A sorted list is rotated by 'k' rotations either CLK or CCLK . Find k 

public class FindRotation {

	Node head;

	public static void main(String[] args) {
		FindRotation fr = new FindRotation();
		LkdList l1 = new LkdList();
		// LIST 1 2 3 4 5
		// CLK 4 5 1 2 3
		// CCK 3 4 5 1 2

		l1.addNodeToList(1);
		l1.addNodeToList(2);
		l1.addNodeToList(3);
		l1.addNodeToList(4);
		l1.addNodeToList(5);

		fr.head = l1.head;
		System.out.println(checkRotation(fr.head) + " rotations.");

	}

	// Assuming List is sorted in ascending order
	static int checkRotation(Node head) {
		boolean isAscending = false;
		if (head == null || head.next == null)
			return -1;

		Node n_check = head;

		if (null != n_check.next.next) {
			if (n_check.data < n_check.next.data && n_check.next.data < n_check.next.next.data)
				isAscending = true;
			else
				isAscending = false;
		}
		Node n1 = head;
		int k1 = -1;
		int ctr1 = 0;
		// Check increasing
		while (n1 != null && n1.next != null) {
			ctr1++;
			if (isAscending && n1.next.data < n1.data && k1 == -1) {
				k1 = ctr1;
				break;
			} else if (!isAscending && n1.next.data > n1.data && k1 == -1) {
				k1 = ctr1;
				break;
			}

			n1 = n1.next;
		}
		return ((k1 == -1) ? 0 : k1);
	}

}
