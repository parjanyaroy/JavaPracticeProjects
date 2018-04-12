package com.smartphone.filehandler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.smartphone.transferables.DocFile;
import com.smartphone.transferables.FileType;
import com.smartphone.transferables.GameFile;
import com.smartphone.transferables.ImageFile;
import com.smartphone.transferables.PdfFile;
import com.smartphone.transferables.PhotoFile;
import com.smartphone.transferables.Transferable;
import com.smartphone.transferables.VideoFile;

public class TransferListFactory {
	
	List<Transferable> transferList = new ArrayList<>();
	String devicePath;

	public Transferable createTransferObject(String absolutePath, String fileName, FileType type,int sourceDevicePathLength) {
		switch(type)
		{
		case DOC: return new DocFile(absolutePath, type, fileName,sourceDevicePathLength);
		case GAMES:return new GameFile(absolutePath, type, fileName,sourceDevicePathLength);
		case  IMG:return new ImageFile(absolutePath, type, fileName,sourceDevicePathLength);
		case PDF:return new PdfFile(absolutePath, type, fileName,sourceDevicePathLength);
		case PHOTO:return new PhotoFile(absolutePath, type, fileName,sourceDevicePathLength);
		case VIDEO:return new VideoFile(absolutePath, type, fileName,sourceDevicePathLength);
		default : return null;
		}
	}

	public void searchFilesByType(FileType type, String filePath) {
		File root = new File(filePath);
		File[] list = root.listFiles();
		if (list != null) { // In case of access error, list is null
			for (File f : list) {
				if (f.isDirectory()) {
					searchFilesByType(type, f.getAbsolutePath());
				} else {
					if (f.getName().endsWith(type.getFileExtension())) {
						System.out.println(f.getAbsoluteFile());
						Transferable newTransferObject = createTransferObject(f.getAbsolutePath(), f.getName(), type,devicePath.length());
						transferList.add(newTransferObject);
					}
				}
			}
		}
	}
	
	public List<Transferable> createTransferList(String devicePath)
	{
		transferList.clear();
		this.devicePath=devicePath;
		for(FileType type : FileType.values())
		{
			searchFilesByType(type, devicePath);
		}
		return this.transferList;
	}

}
