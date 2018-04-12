package com.smartphone.filehandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import com.smartphone.transferables.Transferable;

public class FileCopier {
	
	private static final String LOG_FILENAME = "\\TransferLog.txt";
	boolean firstEntry=true;

	public void initiateFileTransfer(Transferable receivedObject,String targetDevicePath) {
		try
		{
		if(null!=receivedObject && null!=targetDevicePath && receivedObject.getSourceDevicePathLength()!=-1)
		{
			File source=new File(receivedObject.getFilePath());
			File target=new File(targetDevicePath+receivedObject.getFilePath().substring(receivedObject.getSourceDevicePathLength()));
			
			target.getParentFile().mkdirs();
			target.createNewFile();
			boolean isFileTransferred=copyFileUsingStream(source, target);
			if(isFileTransferred)
			{
				logFileName(targetDevicePath,target.getName());
			}
		}
		} catch (IOException e) {
			System.out.println("Error in migrating files between source and target devices");
		}
		
	}
	
	private void logFileName(String targetDevicePath, String name) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			File file = new File(targetDevicePath+LOG_FILENAME);
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			if(this.firstEntry)
			{
			bw.write("\n\nTransfer Log\nDate Of Transfer:"+new Date());
			bw.write("\n=============================================");
			}
			bw.write("\n"+name);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			firstEntry=false;
			try {
				if (bw != null)	bw.close();
				if (fw != null)	fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
	}

	private  boolean copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	        return true;
	    }
	    catch(Exception e)
	    {
	    	return false;
	    }
	    finally {
	        is.close();
	        os.close();
	    }
	    
	}

}
