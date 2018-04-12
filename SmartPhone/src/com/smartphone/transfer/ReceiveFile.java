package com.smartphone.transfer;

import com.smartphone.device.TransferManager;
import com.smartphone.filehandler.FileCopier;
import com.smartphone.transferables.Transferable;

public class ReceiveFile implements Runnable {

	FileCopier fileCopier;
	TransferManager manager;
	String targetDevicePath;
	
	@Override
	public void run() {
		Transferable receivedObject=null;
		do
		{
		receivedObject = manager.receiveObject();
		if(null!=receivedObject)
		System.out.println("RECEIVED:: "+receivedObject.getFileName());
		fileCopier.initiateFileTransfer(receivedObject, targetDevicePath);
		}while(receivedObject.getSourceDevicePathLength()!=-1);
		
	}

	public FileCopier getFileCopier() {
		return fileCopier;
	}

	public void setFileCopier(FileCopier fileCopier) {
		this.fileCopier = fileCopier;
	}

	public TransferManager getManager() {
		return manager;
	}

	public void setManager(TransferManager manager) {
		this.manager = manager;
	}

	public ReceiveFile(FileCopier fileCopier, TransferManager manager,String targetDevicePath) {
		super();
		this.fileCopier = fileCopier;
		this.manager = manager;
		this.targetDevicePath=targetDevicePath;
	}
	
	

}
