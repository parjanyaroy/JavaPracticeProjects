package com.pj.thread.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service2 {

	private static final int THREAD_COUNT = 10;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();

		ExecutorService e1 = Executors.newFixedThreadPool(THREAD_COUNT);
		for (int i = 1; i < 500; i++) {
			Callable<Integer> c1 = new TestClass2(i);
			Future<Integer> f1 = e1.submit(c1);
			futureList.add(f1);
		}

		futureList.forEach(f -> {
			try {
				System.out.println(f.get());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		e1.shutdown();
		// e1.awaitTermination();

	}

}
