package com.smartphone.transferables;

public class GameFile implements Transferable {

	String absolutePath = null;
	String fileName=null;
	FileType fileType;
	int sourceDevicePathLength=0;
	

	public int getSourceDevicePathLength() {
		return sourceDevicePathLength;
	}

	public void setSourceDevicePathLength(int sourceDevicePathLength) {
		this.sourceDevicePathLength = sourceDevicePathLength;
	}


	public GameFile(String filePath, FileType fileType,String fileName, int sourceDevicePathLength) {
		this.absolutePath = filePath;
		this.fileType = fileType;
		this.fileName=fileName;
		this.sourceDevicePathLength=sourceDevicePathLength;
	}

	public String getFilePath() {
		return absolutePath;
	}

	public void setFilePath(String filePath) {
		this.absolutePath = filePath;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
