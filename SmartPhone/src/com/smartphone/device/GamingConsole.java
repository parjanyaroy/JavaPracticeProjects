package com.smartphone.device;

import java.util.List;

import com.smartphone.filehandler.FileCopier;
import com.smartphone.filehandler.TransferListFactory;
import com.smartphone.transfer.ReceiveFile;
import com.smartphone.transfer.TransferFile;
import com.smartphone.transferables.Transferable;

public class GamingConsole implements Device {

	String devicePath = null;
	String deviceName = null;
	TransferManager manager = null;
	Runnable sender = null;
	Runnable receiver = null;

	public TransferManager getManager() {
		return manager;
	}

	public void setManager(TransferManager manager) {
		this.manager = manager;
	}

	public GamingConsole(String devicePath, String deviceName) {
		super();
		this.devicePath = devicePath;
		this.deviceName = deviceName;
		manager = new TransferManager();
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDevicePath() {
		return devicePath;
	}

	public void setDevicePath(String devicePath) {
		this.devicePath = devicePath;
	}

	public boolean initiateConnectionForTransfer(Device target)  {
		if (null != target)
			{
			target.setManager(this.manager);
			return true;
			}
		else {
			return false;
		}
	}

	public void initiateTransfer() {
		List<Transferable> transferList = new TransferListFactory().createTransferList(this.devicePath);
		sender = new TransferFile(this.manager, transferList);
		new Thread(sender).start();
	}

	public void initiateReception() {
		FileCopier fileCopier = new FileCopier();
		receiver = new ReceiveFile(fileCopier, this.manager, this.getDevicePath());
		new Thread(receiver).start();
	}

}
