package com.stack;

public class StackQueueTest {

	public static void main(String[] args) throws StackOverUnderFlow, QueueExceptions {
		queuetest();

	}

	private static void stacktest() throws StackOverUnderFlow {
		StackArray s1 = new StackArray(5);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		// s1.push(6);
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		s1.push(6);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(10);
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
		System.out.println((s1.pop()));
	}

	private static void queuetest()  {
		//QueueArray q1 = new QueueArray(5);
		QueueUsingStk q1=new QueueUsingStk();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		System.out.println("------------------");
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println("------------------");
		q1.enqueue(6);
		q1.enqueue(7);
		q1.enqueue(8);
		q1.enqueue(9);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
		//System.out.println(q1.dequeue());
	}
}
