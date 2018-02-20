package com.pj.thread.waitnotify;

public class Notifier implements Runnable {
	
	Message message;
	
	public Notifier(Message message) {
		super();
		this.message = message;
	}

	public void run()
	{
		synchronized(message)
		{
			if(null==message.getMessage())
			{
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Setting message in notifier");
				message.setMessage("-->NOTIFIER MESSAGE<--");
				//message.notify();
				message.notifyAll();
			}
		}
	}

}
