package com.pj.thread.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {

	// The parallelism level indicates how many threads or CPUs you want to
	// work concurrently on on tasks passed to the ForkJoinPool
	static ForkJoinPool forkJoinPool = new ForkJoinPool(4);

	public static void main(String[] args) {
		boolean executeRecursiveAction = true;
		if (executeRecursiveAction) {
			MyRecursiveAction myRecursiveAction = new MyRecursiveAction(24);
			forkJoinPool.invoke(myRecursiveAction);
		} else {
			MyRecursiveTask myRecursiveTask = new MyRecursiveTask(128);
			long mergedResult = forkJoinPool.invoke(myRecursiveTask);
			System.out.println("mergedResult = " + mergedResult);

		}

	}

}
