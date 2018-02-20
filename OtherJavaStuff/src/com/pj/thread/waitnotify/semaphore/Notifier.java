package com.pj.thread.waitnotify.semaphore;

public class Notifier implements Runnable {
	
	Message message;
	
	Semaphore semaphore;
	
	public Notifier(Message message,Semaphore semaphore) {
		super();
		this.message = message;
		this.semaphore=semaphore;
	}

	public void run()
	{
		synchronized(message)
		{
			if(null==message.getMessage())
			{
				System.out.println("Setting message in notifier");
				message.setMessage("-->NOTIFIER MESSAGE<--");
				//message.notify();
				this.semaphore.take();
			}
		}
	}

}
