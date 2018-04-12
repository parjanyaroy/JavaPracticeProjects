package com.pj;

import java.io.File;
import java.io.FilenameFilter;

public class FileFinderRecursive {
	public void listAllFiles(String path,String type) {
		
		File root = new File(path);
		File[] list = root.listFiles();
		if (list != null) { // In case of access error, list is null
			for (File f : list) {
				if (f.isDirectory()) {
					listAllFiles(f.getAbsolutePath(),type);
				} else {
					if(f.getName().endsWith(type))
				System.out.println(f.getAbsoluteFile());
			}
			}
		}
	}

	public static void main(String[] args) {
		FileFinderRecursive ff = new FileFinderRecursive();
		String rootFolder = "C:\\Users\\parroy\\Desktop\\Junk";
		String type=".jpg";
		System.out.println("List of all files under " + rootFolder);
		System.out.println("------------------------------------");

		ff.listAllFiles(rootFolder,type); // this will take a while to run!

	}
	// inner class, generic extension filter
		/*public class GenericExtFilter implements FilenameFilter {

			private String ext;

			public GenericExtFilter(String ext) {
				this.ext = ext;
			}

			public boolean accept(File dir, String name) {
				return (name.endsWith(ext));
			}
		}
*/
}
