package com.pj.tester;

import com.smartphone.device.Device;
import com.smartphone.device.GamingConsole;

public class TransferExecutor {

	public static void main(String[] args) throws Exception {
		Device source = new GamingConsole("C:\\Users\\parroy\\Desktop\\SmartPhone\\Device1", "OldDevice");
		Device target = new GamingConsole("C:\\Users\\parroy\\Desktop\\SmartPhone\\Device2", "NewDevice");
		// Establishing connection between source and target
		if(source.initiateConnectionForTransfer(target))
		{
		// Starting transfer from source
		source.initiateTransfer();
		// Starting receiver to receive data
		target.initiateReception();
		}

	}

}
