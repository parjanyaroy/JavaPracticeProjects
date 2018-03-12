package com.pj.graphs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	//
	int V;
	private LinkedList<Integer> arr[];

	Graph(int v) {
		this.V = v;
		arr = new LinkedList[v];
		for (int j = 0; j < v; j++) {
			arr[j] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int i, int j) {
		arr[i].add(j);
	}

	// Basic Method For Graph Ends Here

	private void DFSCall(int i) {
		boolean visited[] = new boolean[V];
		Arrays.fill(visited, false);
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(i);
		while (!s1.isEmpty()) {
			int x = s1.pop();
			if (!visited[x]) {
				System.out.print(x + " ");
				visited[x] = true;
			}
			ListIterator<Integer> itr = (ListIterator<Integer>) arr[x].iterator();
			while (itr.hasNext()) {
				int test = itr.next();
				if (!visited[test]) {
					s1.push(test);
				}
			}
		}
	}

	private void BFSCall(int i) {
		boolean visited[] = new boolean[V];
		Arrays.fill(visited, false);
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(i);
		while (!q1.isEmpty()) {
			int x = q1.poll();
			System.out.print(x + " ");
			visited[x] = true;
			ListIterator<Integer> itr = (ListIterator<Integer>) arr[x].iterator();
			while (itr.hasNext()) {
				int test = itr.next();
				if (!visited[test]) {
					q1.add(test);
				}
			}
		}

	}

	private void recursiveDFSCall(int n) {
		boolean visited[] = new boolean[V];
		Arrays.fill(visited, false);
		rDFSCall(visited, n);
	}

	private void rDFSCall(boolean[] visited, int n) 
	{
		if (!visited[n]) 
		{
			System.out.print(n + " ");
			visited[n] = true;
		}
		Iterator<Integer> itr = arr[n].iterator();
		while (itr.hasNext()) {
			int x = itr.next();
			if (!visited[x]) {
				rDFSCall(visited, x);
			}
		}

	}
	
	private void recursiveBFSCall(int n) {
		boolean visited[] = new boolean[V];
		Arrays.fill(visited, false);
		Queue q1 = new LinkedList<Integer>();
		q1.add(n);
		rBFSCall(visited,q1);
	}

	private void rBFSCall(boolean[] visited, Queue<Integer> q1) {
		if(q1.isEmpty())
			return;
		int x = q1.poll();
		System.out.print(x+ " ");
		visited[x]=true;	

		Iterator<Integer> itr = arr[x].iterator();
		while (itr.hasNext()) {
			int y = itr.next();
			if (!visited[y]) {
				q1.add(y);
			}
		}
		rBFSCall(visited, q1);

	}


	public void topologicalSorting()
	{
		boolean visited[] = new boolean[V];
		Arrays.fill(visited, false);
		Stack s1= new Stack<>();
		for(int i=0;i<V;i++)
			if(!visited[i])
			sortGraph(visited,s1,i);
			
		while(!s1.isEmpty())
		{
			System.out.print(s1.pop()+" ");
		}
			
	}
	
	
	private void sortGraph(boolean[] visited, Stack s1, int i) {
	
	visited[i]=true;
	Iterator<Integer> itr = arr[i].iterator();
	while(itr.hasNext())
	{
		int j=itr.next();
		if(!visited[j])
		{
			//visited[j]=true;
			sortGraph(visited, s1, j);
		}
		
	}
	s1.push(i);
	
		
	}

	public static void main(String[] args) {
		// Total 5 vertices in graph
		Graph g = new Graph(5);

		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 4);

		Graph g2 = new Graph(4);

		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(1, 2);
		g2.addEdge(2, 0);
		g2.addEdge(2, 3);
		g2.addEdge(3, 3);
		
		
		Graph g3 = new Graph(6);
        g3.addEdge(5, 2);
        g3.addEdge(5, 0);
        g3.addEdge(4, 0);
        g3.addEdge(4, 1);
        g3.addEdge(2, 3);
        g3.addEdge(3, 1);
		
		System.out.println("ITERATIVE");
		System.out.println("Following is the Depth First Traversal (0)");
		g.DFSCall(0);
		System.out.println();
		System.out.println("Following is Breadth First Traversal (2)");
		g2.BFSCall(2);
		System.out.println();
		System.out.println("RECURSIVE");
		System.out.println("Following is the Depth First Traversal (2)");
		g2.recursiveDFSCall(2);
		System.out.println();
		System.out.println("Following is Breadth First Traversal (2)");
		g2.recursiveBFSCall(2);
		System.out.println();
		System.out.println("TOPOLOGICAL SORT");
		g3.topologicalSorting();
		
		
		
	}

}
