package com.pj.externalsort;

import java.io.File;
import java.util.Comparator;
import java.util.List;

public interface ExternalSort {
	
	// we divide the file into small blocks. If the blocks
    // are too small, we shall create too many temporary files. 
    // If they are too big, we shall be using too much memory. 
	public long estimateBestSizeOfBlocks(File filetobesorted);
	
	public  List<File> sortInBatch(File file, Comparator<String> cmp);
	
	public File sortAndSave(List<String> tmplist, Comparator<String> cmp);
	
	 public int mergeSortedFiles(List<File> files, File outputfile, final Comparator<String> cmp);

}
