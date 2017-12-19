package com.pj.thread.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service3 {

	private static final int THREAD_COUNT = 10;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();

		ExecutorService e1 = Executors.newFixedThreadPool(THREAD_COUNT);
		CompletionService c1 = new ExecutorCompletionService<>(e1);
		
		
		for (int i = 1; i < 500; i++) {
			Callable<Integer> callable = new TestClass2(i);
			Future<Integer> f1 = c1.submit(callable);
			futureList.add(f1);
		}
		for(Future<Integer> f : futureList)
		{
			System.out.println(f.get());
		}
		
		

		e1.shutdown();
		// e1.awaitTermination();

	}

}
