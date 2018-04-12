package com.smartphone.transfer;

import java.util.List;

import com.smartphone.device.TransferManager;
import com.smartphone.transferables.FileType;
import com.smartphone.transferables.Transferable;

public class TransferFile implements Runnable {

	TransferManager manager;
	List<Transferable> transferList;
	
	@Override
	public void run() {
		for(Transferable file : transferList)
		{
			manager.transferObject(file);
			System.out.println("SENT:: "+file.getFileName());
		}
		manager.transferObject(new Transferable() {
			
			@Override
			public int getSourceDevicePathLength() {
				// TODO Auto-generated method stub
				return -1;
			}
			
			@Override
			public FileType getFileType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getFilePath() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getFileName() {
				// TODO Auto-generated method stub
				return null;
			}
		}); // SIGNIFYING THE END OF TRANSFER
	}

	public TransferFile(TransferManager manager, List<Transferable> transferList) {
		super();
		this.manager = manager;
		this.transferList = transferList;
	}
	
	

}
