package com.pj.thread.waitnotify;

public class Waiter implements Runnable {

	private Message msg;

	Waiter(Message msg) {
		this.msg = msg;
	}

	public void run() {
		try {
			String cTh = Thread.currentThread().getName();
			System.out.println(cTh + "Started");
			synchronized (msg) {
				if (null == msg.getMessage())
					msg.wait();
			}
			System.out.println(cTh+" Message is "+msg.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
