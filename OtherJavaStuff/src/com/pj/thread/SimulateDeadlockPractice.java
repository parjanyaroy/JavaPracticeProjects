package com.pj.thread;

class SampleClass implements Runnable {
	private Integer resourceA = new Integer(10);
	private Integer resourceB = new Integer(20);
	public boolean isALocked = false;

	public void run() {
		try {
			if (!isALocked)
				readAB();
			else
				readBA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readAB() throws InterruptedException {
		synchronized (resourceA) {
			this.isALocked = true;
			System.out.println("Lock Aquired on resource A");
			Thread.sleep(3000);
			synchronized (resourceB) {
				System.out.println("Lock Aquired on resource B");
			}
		}
	}

	public void readBA() throws InterruptedException {
		synchronized (resourceB) {
			System.out.println("Lock Aquired on resource B");
			synchronized (resourceA) {
				System.out.println("Lock Aquired on resource A");
			}
		}
	}

}

public class SimulateDeadlockPractice {
	public static void main(String[] args) {
		SampleClass s1 = new SampleClass();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		t1.start();
		t2.start();
	}
}
