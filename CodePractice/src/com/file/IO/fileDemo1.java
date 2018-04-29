package com.file.IO;

import java.io.File;
/**
 * 查询文件递归
 * @author Administrator
 *
 */
public class fileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:"+File.separator);
		printFile(f);
	}
	public static void printFile(File file){
		if(file!=null){
			if (file.isDirectory()) {
				File fileArray[] = file.listFiles();
				for (int i = 0; i < fileArray.length; i++) {
					printFile(fileArray[i]);
				}
			}else {
				System.out.println(file.getAbsolutePath());
			}
		}else {
			System.out.println("文件/文件夹是空的。。。");
		}
	}
}
