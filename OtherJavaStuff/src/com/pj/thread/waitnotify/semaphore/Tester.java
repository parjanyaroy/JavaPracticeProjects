package com.pj.thread.waitnotify.semaphore;

/** The two threads on waiter class waits on the
notifier class to set the message field from
null.if notify is used only a ssingle thread is notified whereas
if notifyall is used both the threads are notified*/


public class Tester {

	public static void main(String[] args) throws InterruptedException {
		Semaphore s1 = new Semaphore();
		Message m1 = new Message();
		Waiter w1 = new Waiter(m1,s1);
		Notifier n1 = new Notifier(m1,s1);
		
		Thread waiter1 =new Thread(w1);
		Thread waiter2 =new Thread(w1);
		
		Thread notifier1 = new Thread(n1);
		waiter1.start();
		waiter2.start();
		Thread.sleep(3000);
		
		notifier1.start();
		
	}

}
