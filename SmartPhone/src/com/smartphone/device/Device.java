package com.smartphone.device;

public interface Device {
	
	public TransferManager getManager();
	public void setManager(TransferManager manager);
	public void initiateTransfer();
	public void initiateReception();
	public boolean initiateConnectionForTransfer(Device target);

}
