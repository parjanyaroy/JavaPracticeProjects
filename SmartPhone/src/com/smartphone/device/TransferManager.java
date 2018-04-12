package com.smartphone.device;

import java.util.concurrent.Semaphore;

import com.smartphone.transferables.Transferable;

public class TransferManager {
	
	Semaphore sourceDevice = new Semaphore(1);
	Semaphore targetDevice = new Semaphore(0);
	
	Transferable trasferables;
		
	public void transferObject(Transferable object)
	{
		try {
			sourceDevice.acquire();
			this.trasferables=object;
			targetDevice.release();
			} catch (InterruptedException e) {
			System.out.println("Error Initiating Transfer: "+e.getMessage());
			}
	}
	
	public Transferable receiveObject()
	{	Transferable object=null;
		try {
			targetDevice.acquire();
			object=this.trasferables;
			sourceDevice.release();
			return object;
			} catch (InterruptedException e) {
			System.out.println("Error Initiating Transfer: "+e.getMessage());
			}
		return object;
	}
	

}
