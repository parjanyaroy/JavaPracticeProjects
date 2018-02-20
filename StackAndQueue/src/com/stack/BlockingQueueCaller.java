package com.stack;

public class BlockingQueueCaller implements Runnable {

	boolean isEnqueue = true;

	BlockingQueue bq;

	public BlockingQueueCaller(boolean isEnqueue, BlockingQueue bq) {
		super();
		this.isEnqueue = isEnqueue;
		this.bq = bq;
	}

	@Override
	public void run() {
		try {
			if (isEnqueue) {

				bq.enqueue(((int) Math.random()) * 100);
			} else {

				bq.dequeue();

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
