package com.file.IO;

import java.io.File;
import java.io.FilenameFilter;
public class filterByJavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("f:"+File.separator);
		printJava(file);
	}

	public static void printJava(File file) {
		
		// TODO Auto-generated method stub
		if(file!=null){
			if(file.isDirectory()){
				File[] files = file.listFiles();
				for(int i =0; i<files.length;i++){
					//String name = files[i].getName();
					
					
					printJava(files[i]);
					}
			}else{
					
					if(file.getName().endsWith(".java")){
						
					
						System.out.println(file);
					}
			}
		}else{
			
			System.out.println("文件或文件夹是空的....");
		}
		
	}
	
}
