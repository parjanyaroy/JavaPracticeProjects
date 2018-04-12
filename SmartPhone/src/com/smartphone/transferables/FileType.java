package com.smartphone.transferables;

public enum FileType {
	PDF(".pdf"),
	GAMES(".apk"),
	DOC(".doc"),
	PHOTO(".jpg"),
	VIDEO(".mp4"),
	IMG(".png");
	
	private String fileExtension;
	
	private FileType(String fileExtension)
	{
		this.fileExtension=fileExtension;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	
	

}
