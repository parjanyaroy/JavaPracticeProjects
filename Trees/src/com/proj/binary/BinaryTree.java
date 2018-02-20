package com.proj.binary;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BinaryTree {

	public static class Node {
		int data;
		Node right;
		Node left;

		public Node(int data) {
			super();
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}

	Node root;
	static Node printRoot;

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = bt.generateTree(10);
		/****************** INORDER TRAVERSAL ***********************/
		System.out.print("Inorder  : ");
		bt.inOrder(bt.root);
		System.out.println();
		System.out.print("Iterative: ");
		bt.inOrderIterative(bt.root);
		System.out.println();
		/****************** PREORDER TRAVERSAL ***********************/
		System.out.print("Preorder  : ");
		bt.preOrder(bt.root);
		System.out.println();
		System.out.print("Iterative : ");
		bt.preOrderIterative(bt.root);
		System.out.println();
		/****************** POSTORDER TRAVERSAL ***********************/
		System.out.print("Postorder : ");
		bt.postOrder(bt.root);
		System.out.println();
		System.out.print("Iterative : ");
		bt.postOrderIterative(bt.root);
		System.out.println();
		/****************** TREE PRINTER ***********************/
		printRoot = bt.root;
		(new BTreePrinter()).printNode(printRoot);
		System.out.println("Height = " + bt.getHeight(bt.root));
		/****************** LEVELORDER RECURSIVE TRAVERSAL ***********************/
		bt.printLevelOrder(bt.root);
		/****************** LEVELORDER QUEUE TRAVERSAL / FIND MAX ELEMENT***********************/
		System.out.println("\n Max Element is :"+bt.printLevelOrderQueue(bt.root));
		/****************** SEARCH ELEMENT IN BINARY TREE***********************/
		System.out.println("SearchElement in tree "+bt.searchInTree(bt.root,5));
		
	}

	

	private  boolean searchInTree(Node root, int i) {
		if(root==null)
			return false;
		if(root.data==i)
			return true;
		else
		{
			return searchInTree(root.left,i)||searchInTree(root.right,i);
		}
		}



	public Node generateTree(int n) {
		Set<Integer> s1=new HashSet<>();
		if (n < 1)
			return null;
		if (this.root == null) {
			root = new Node((int) (Math.random() * 100));
		}
		for (int j = 2; j <= n; j++) {
			int x=0;
			do
			{
			x = (int) (Math.random() * 100);
			}
			while(!s1.add(x));
			addNode(x, root);
		}
		return root;

	}

	public Node addNode(int data, Node root) {
		if (root == null) {
			return new Node(data);
		} else {
			if (data > root.data)
				root.right = addNode(data, root.right);
			else
				root.left = addNode(data, root.left);

			return root;
		}

	}

	void printArray(int arr[], String title) {
		System.out.println("----" + title + "----");
		for (int i : arr)
			System.out.println(i + " ");
	}

	void preOrder(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	void inOrder(Node root) {
		if (root == null)
			return;
		else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	void postOrder(Node root) {
		if (root == null)
			return;
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	int getHeight(Node root) {
		if (root == null)
			return 0;
		else {
			int left = getHeight(root.left);
			int right = getHeight(root.right);
			return Math.max(left, right) + 1;
		}
	}

	void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	void printLevelOrder(Node root) {
		System.out.println("----LEVEL ORDER TRAVERSAL-------");
		int h = getHeight(root);
		for (int j = 1; j <= h; j++) {
			printGivenLevel(root, j);
			System.out.println();
		}
	}
	/* Push Root.
	 * Iterate : pop node .process node . push left . push right
	 */
	void preOrderIterative(Node root) {
		Stack<Node> s1 = new Stack<Node>();
		s1.push(root);
		while (!s1.isEmpty()) {
			Node temp = s1.pop();
			System.out.print(temp.data + " ");
			if (null != temp.right)
				s1.push(temp.right);
			if (null != temp.left)
				s1.push(temp.left);
		}
	}
	/* currentnode=root
	 *  Iterate : 	push currentnode and all left elements untill null . 
	 *  			Pop and process node . if right child set as current node.
	 */
	void inOrderIterative(Node root) {
		Stack<Node> s1 = new Stack<>();
		Node currentNode = root;
		while (1 == 1) {
			while (currentNode != null) {
				s1.push(currentNode);
				currentNode = currentNode.left;
			}
			if (!s1.isEmpty()) {
				Node tempNode = s1.pop();
				System.out.print(tempNode.data + " ");
				currentNode = tempNode.right;
			} else {
				break;
			}
		}
	}
	/*	Iterate:
	 * Traverse left path pushing first right child and then current node for each
	 * 
	 */
			
	void postOrderIterative(Node root) {
		Stack<Node> s1 = new Stack<>();
		Node currentNode = root;
		while (1 == 1) {
			while (currentNode != null) {
				if (currentNode.right != null)
					s1.push(currentNode.right);
				s1.push(currentNode);
				currentNode = currentNode.left;
			}
			if (!s1.isEmpty()) {
				Node temp = s1.pop();
				if (!s1.isEmpty() && temp.right == s1.peek()) {
					currentNode = s1.pop();
					s1.push(temp);
				} else {
					System.out.print(temp.data + " ");
					currentNode = null;
				}
			} else
				break;
		}

	}
	
	int printLevelOrderQueue(Node root)
	{
		// Find max element in tree code is similar to this.
		int maxElement = Integer.MIN_VALUE;
		Queue<Node> q1 = new LinkedList<>();
		if(root!=null)
			q1.add(root);
		while(!q1.isEmpty())
		{
			Node temp = q1.poll();
			System.out.print(temp.data+" ");
			if(temp.data>maxElement)
				maxElement=temp.data;
			if(null!=temp.left)
				q1.add(temp.left);
			if(null!=temp.right)
				q1.add(temp.right);
		}
		return maxElement;
	}

}
