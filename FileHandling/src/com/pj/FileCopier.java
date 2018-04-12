package com.pj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopier {
	
	private static void copyFileUsingStream(File source, File dest) throws IOException {
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
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	
	public static void main(String[] args) throws IOException {
	File f_source = new File("C:\\Users\\parroy\\Desktop\\Junk\\testCaseSteps.txt");
	File f_dest = new File("C:\\Users\\parroy\\Desktop\\Junk2\\testCaseSteps.txt");
	f_dest.getParentFile().mkdirs();
	f_dest.createNewFile();
	copyFileUsingStream(f_source, f_dest);
	}

}
