package com.pj.thread;

class A implements Runnable
{
	Integer resource1 = new Integer(10);
	Integer resource2 = new Integer(20);
	boolean locked1=false;

	@Override
	public void run() {
		try
		{
		if(!locked1)
			lock1();
		else
			lock2();
		}
		catch(Exception e)
		{
			
		}
				
	}
	
	void lock1() throws InterruptedException
	{
		locked1=true;
		synchronized(resource1)
		{
			System.out.println("Lock On Resource 1");
			Thread.sleep(1000);
			synchronized(resource2)
			{
				System.out.println("Lock On Resource 2");
			}
		}
	}
	void lock2() throws InterruptedException
	{
		synchronized(resource2)
		{
			System.out.println("Lock On Resource 2");
			Thread.sleep(1000);
			synchronized(resource1)
			{
				System.out.println("Lock On Resource 1");
			}
		}
	}
	
}


public class SimulateDeadLock {
	  public static void main(String[] args) {
	   A a = new A();
	   Thread t1 = new Thread(a);
	   Thread t2 = new Thread(a);
	    t1.start();
	    t2.start();
	  }
	}
