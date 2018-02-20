package com.proj.binary;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import com.proj.binary.BinaryTree.Node;

public class BinaryTreeProblems {

	Node root;

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = bt.generateTree(7);
		BinaryTreeProblems b1 = new BinaryTreeProblems();
		b1.root = bt.root;
		BTreePrinter.printNode(b1.root);
		System.out.println("Max Value In Tree " + b1.findMaximum(b1.root));

		// int x=b1.gUI("Enter Element To Be Searched");
		// System.out.println(b1.searchElementInBinaryTree(b1.root, x));

		/*
		 * System.out.println("No of elements In Tree " +
		 * b1.findNoOfElements(b1.root)); System.out.println(
		 * "Max Depth Of Tree " + b1.findDepthOfTree(b1.root, true));
		 * System.out.println("Min Depth Of Tree " + b1.findDepthOfTree(b1.root,
		 * false));
		 */

		/*
		 * int x1=b1.gUI("Enter Node Elememt To Be Searched");
		 * System.out.println(b1.searchNodeInTree(b1.root, x1));
		 */

		/*
		 * int x2=b1.gUI("Enter Node Elememt To Be Deleted");
		 * System.out.println(b1.deleteNodeOfTree(b1.root, x2));
		 * BTreePrinter.printNode(b1.root);
		 */

		/*
		 * Node cloneRoot = b1.cloneATree(b1.root); cloneRoot.left.data = -1;
		 * cloneRoot.right.right = null; BTreePrinter.printNode(cloneRoot);
		 * System.out.println("Check If Trees are isomorphic " +
		 * b1.isStructurallyIdentical(b1.root, cloneRoot)); System.out.println(
		 * "Check If Trees are identical " + b1.isIdentical(b1.root,
		 * cloneRoot));
		 */

		/*
		 * System.out.println("Check Width Of Tree " +
		 * b1.getWidthOfTree(b1.root));
		 */

		/*
		 * int x3=b1.gUI("Enter Node Elememt To Get Path");
		 * b1.findPathToNode(b1.root, x3); System.out.println(
		 * "Path To Node From Root"); Set<Integer> findPathToNode =
		 * b1.findPathToNode(b1.root, x3); for(int i : findPathToNode) {
		 * System.out.print(i+" "); }
		 */

		/*
		 * int x4=b1.gUI("Enter First Node To Get Common Ancestor:"); int
		 * x5=b1.gUI("Enter Second Node To Get Common Ancestor:");
		 * System.out.println("Common Ancestor is :"+b1.findCommonAncestor(x4,
		 * x5, b1.root));
		 */

		/*
		 * int x4 = b1.gUI("Enter Sum:"); System.out.println("Checking For Sum:"
		 * + b1.isPathWithGivenSum(x4, b1.root));
		 */

		/*
		 * Node mirrorRoot = b1.createMirrorTree(b1.root);
		 * BTreePrinter.printNode(mirrorRoot);
		 */

		/*
		 * HashMap<Integer, Integer> h1 = new HashMap<>();
		 * b1.getVerticalSum(b1.root, h1, 0); System.out.println(
		 * "Vertical Summation:"); for(Entry e : h1.entrySet()) {
		 * System.out.println(e.getKey()+" "+e.getValue()); }
		 */
		//b1.viewOfTree(b1.root);
		//b1.leftviewOfTree(b1.root);
		b1.rightviewOfTree(b1.root);

	}

	int gUI(String text) {
		System.out.println(text + ":");
		Scanner in = new Scanner(System.in);
		return Integer.parseInt(in.nextLine());
	}

	int findMaximum(Node root) {
		int max = Integer.MIN_VALUE;

		if (root != null) {
			int leftMax = findMaximum(root.left);
			int rightMax = findMaximum(root.right);
			max = leftMax > rightMax ? leftMax : rightMax;
			if (max < root.data)
				max = root.data;
		}
		return max;
	}

	boolean searchElementInBinaryTree(Node root, int n) {
		if (root == null)
			return false;
		if (root.data == n)
			return true;
		else {
			return searchElementInBinaryTree(root.left, n) || searchElementInBinaryTree(root.right, n);
		}

	}

	int findNoOfElements(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + findNoOfElements(root.left) + findNoOfElements(root.right);
	}

	int findDepthOfTree(Node root, boolean isMax) {
		if (root == null)
			return 0;
		else {
			return isMax ? (1 + Math.max(findDepthOfTree(root.left, isMax), findDepthOfTree(root.right, isMax)))
					: (1 + Math.min(findDepthOfTree(root.left, isMax), findDepthOfTree(root.right, isMax)));
		}
	}

	Node searchNodeInTree(Node root, int n) {
		if (root == null)
			return null;
		if (root.data == n) {
			return root;
		} else {
			Node n_left = searchNodeInTree(root.left, n);
			Node n_right = searchNodeInTree(root.right, n);
			if (null == n_left && null == n_right) {
				return null;
			} else
				return n_left == null ? n_right : n_left;

		}
	}

	Node deleteNodeOfTree(Node root, int n) {
		if (root == null)
			return null;
		else {
			if (n > root.data)
				root.right = deleteNodeOfTree(root.right, n);
			else if (n < root.data)
				root.left = deleteNodeOfTree(root.left, n);
			else {
				if (root.left == null && root.right == null) {
					return null;
				} else if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					Node temp = root.right;
					while (temp.left != null) {
						temp = temp.left;
					}
					root.data = temp.data;
					root.right = deleteNodeOfTree(root.right, root.data);
					return root;
				}

			}
		}
		return root;

	}

	boolean isStructurallyIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if ((root1 == null && root2 != null) || (root2 == null && root1 != null)) {
			return false;
		} else {
			return isStructurallyIdentical(root1.left, root2.left) && isStructurallyIdentical(root1.right, root2.right);

		}
	}

	boolean isIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if ((root1 == null && root2 != null) || (root2 == null && root1 != null)) {
			return false;
		} else if (root1.data != root2.data)
			return false;
		else {
			return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);

		}
	}

	Node cloneATree(Node root) {
		if (root == null)
			return null;
		else {
			Node newRoot = new Node(root.data);
			newRoot.left = cloneATree(root.left);
			newRoot.right = cloneATree(root.right);
			return newRoot;
		}

	}

	int getWidthOfTree(Node root) {
		Queue<Node> q1 = new LinkedList<>();
		if (null != root)
			;
		{
			q1.add(root);
			q1.add(null);
		}
		int max = Integer.MIN_VALUE;
		int levelNodeCount = 0;
		int sumLevel = 0;
		while (!q1.isEmpty()) {
			Node elem = q1.remove();
			if (q1.isEmpty()) {
				break;
			} else {
				if (null == elem) {
					q1.add(null);
					if (max < levelNodeCount)
						max = levelNodeCount;
					System.out.println("Sum at level:" + sumLevel);
					levelNodeCount = 0;
					sumLevel = 0;
				} else {
					levelNodeCount++;
					sumLevel = sumLevel + elem.data;
					if (null != elem.left)
						q1.add(elem.left);
					if (null != elem.right)
						q1.add(elem.right);
				}
			}
		}
		return max;
	}

	Set<Integer> findPathToNode(Node root, int nodeData) {
		Set<Integer> s1 = new LinkedHashSet<>();
		while (null != root) {
			if (nodeData > root.data) {
				s1.add(root.data);
				root = root.right;
			} else if (nodeData < root.data) {
				s1.add(root.data);
				root = root.left;
			} else if (nodeData == root.data) {
				s1.add(root.data);
				break;
			}
		}
		if (root == null)
			s1.clear();
		return s1;
	}

	int findCommonAncestor(int node1Data, int node2Data, Node root) {
		Set<Integer> s1 = findPathToNode(root, node1Data);
		Node prev = null;
		while (null != root && !s1.add(root.data)) {
			prev = root;
			if (node2Data > root.data)
				root = root.right;
			else if (node2Data < root.data)
				root = root.left;
			else
				break;
		}
		return prev.data;
	}

	boolean isPathWithGivenSum(int sum, Node root) {
		if (sum == 0 && root == null)
			return true;
		if (root == null || sum < 0)
			return false;
		else
			return isPathWithGivenSum(sum - root.data, root.left) || isPathWithGivenSum(sum - root.data, root.right);
	}

	public Node createMirrorTree(Node root) {
		if (root == null)
			return null;
		else {
			Node newNode = new Node(root.data);
			newNode.left = createMirrorTree(root.right);
			newNode.right = createMirrorTree(root.left);
			return newNode;
		}
	}

	int getVerticalSum(Node root, HashMap<Integer, Integer> map, int pos) {
		if (root == null)
			return 0;
		else {
			if (null == map.get(pos))
				map.put(pos, root.data);
			else {
				int newSum = root.data + map.get(pos);
				map.put(pos, newSum);
			}
			getVerticalSum(root.left, map, pos - 1);
			getVerticalSum(root.right, map, pos + 1);
			return 1;
		}
	}

	void viewOfTree(Node root) {
		if (root == null)
			return;
		Queue<Node> q1 = new LinkedList<Node>();
		q1.add(root);
		int count = 1;
		while (1 == 1) {
			count = q1.size();
			if (count == 0)
				break;
			while (count > 0) {
				Node n = q1.remove();
				System.out.print(n.data + " ");
				if (null != n.left)
					q1.add(n.left);
				if (null != n.right)
					q1.add(n.right);
				count--;
			}
			System.out.println();
		}

	}

	void leftviewOfTree(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q1 = new LinkedList<Node>();
		q1.add(root);
		int count=1;
		
		while(1==1)
		{
			boolean firstElement=true;
			count = q1.size();
			if(count==0)
				break;
			while(count>0)
			{
				Node n = q1.remove();
				if(firstElement)
				{
				System.out.print(n.data+" ");
				firstElement=false;
				}
				if(null!=n.left)
					q1.add(n.left);
				if(null!=n.right)
					q1.add(n.right);
				count --;
			}
			System.out.println();
		}
	}

	void rightviewOfTree(Node root) {
		if (root == null)
			return;
		Queue<Node> q1 = new LinkedList<Node>();
		q1.add(root);
		int count = 1;

		while (1 == 1) {
			count = q1.size();
			if (count == 0)
				break;
			while (count > 0) {
				Node n = q1.remove();
				if (count == 1)
					System.out.print(n.data + " ");

				if (null != n.left)
					q1.add(n.left);
				if (null != n.right)
					q1.add(n.right);
				count--;
			}
			System.out.println();
		}
	}

}
