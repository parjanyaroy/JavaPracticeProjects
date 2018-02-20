package com.pj.checksum;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CalculateCheckSum {

	public static String calculateHash(MessageDigest algorithm, String fileName) throws Exception {

		// add salt
		algorithm.update("6e616d7261746861626f64646170617469".getBytes());

		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DigestInputStream dis = new DigestInputStream(bis, algorithm);

		// read the file and update the hash calculation
		while (dis.read() != -1);

		// get the hash value as byte array
		byte[] hash = algorithm.digest();

		return bytesToHex(hash);
	}

	public static String bytesToHex(byte[] bytes) {
		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	public static void main(String args[]) throws Exception {

	
		MessageDigest sha1 = MessageDigest.getInstance("SHA1");
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		String sha1Hash = null, md5Hash = null;
		String path="C:\\Users\\parroy\\Desktop\\";
		String filename="checksum.txt";
		sha1Hash = calculateHash(sha1, path + filename);
		md5Hash = calculateHash(md5, path + filename);
		System.out.println("sha1 : "+sha1Hash);
		System.out.println("md5 : "+md5Hash);
		
		
	}

}
