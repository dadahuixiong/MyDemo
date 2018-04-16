package com.file.IO;

import java.io.File;

public class fileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String f = "f:"+File.separator+"java_学习视频";
			File file = new File(f);
			printFile(file);
		
	}
		public static void printFile(File file){
			if (file != null) {
				if (file.isDirectory()) {
					File fileArray[] = file.listFiles();
					for (int i = 0; i < fileArray.length; i++) {
						printFile(fileArray[i]);
					}
				}else {
					System.out.println(file.getAbsoluteFile());
				}
			}
		}
}
