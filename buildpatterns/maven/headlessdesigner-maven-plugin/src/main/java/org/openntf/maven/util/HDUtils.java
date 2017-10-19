package org.openntf.maven.util;

import java.io.File;

public enum HDUtils {
	;
	
	/**
	 * Constructs a file:// URI from the provided system file path and subfolders.
	 * 
	 * @param filePath the base file path in system format
	 * @param subfolders any subfolders to append
	 * @return a file:// URI for the provided path
	 */
	public static String fileUri(String filePath, String... subfolders) {
		StringBuilder sub = new StringBuilder();
		if(subfolders != null) {
			for(String subfolder : subfolders) {
				if(sub.length() > 0) {
					sub.append('/');
				}
				sub.append(subfolder);
			}
		}
		File baseFile = new File(filePath);
		if(sub.length() > 0) {
			File result = new File(baseFile, sub.toString());
			return result.toURI().toString();
		} else {
			return baseFile.toURI().toString();
		}
		
	}
}
