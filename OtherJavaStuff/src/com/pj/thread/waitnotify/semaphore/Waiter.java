package com.pj.thread.waitnotify.semaphore;

public class Waiter implements Runnable {

	private Message msg;
	Semaphore semaphore;

	Waiter(Message msg,Semaphore semaphore) {
		this.msg = msg;
		this.semaphore=semaphore;
	}

	public void run() {
		try {
			String cTh = Thread.currentThread().getName();
			System.out.println(cTh + "Started");
			synchronized (msg) {
				if (null == msg.getMessage())
					this.semaphore.release();
			}
			System.out.println(cTh+" Message is "+msg.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
