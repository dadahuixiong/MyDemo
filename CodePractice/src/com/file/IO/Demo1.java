package com.file.IO;

import java.io.*;

public class Demo1 {

	public static void main(String[] args) {
		/*File f = new File("g:\\aaa.txt");
		
		System.out.println("文件路径："+f.getAbsolutePath());
		System.out.println("是不是文件："+f.isFile());
		System.out.println("文件大小："+f.length());*/
		
		/*File f = new File("g:\\zhou\\aaa.txt");
		//创建文件
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("有文件，不能创建");
		}
*/
	
	
	/*//创建目录
		File f = new File("g:\\zhou");
		if(f.isDirectory()){//判断是不是目录
			System.out.println("目录已存在");
		}else{
			f.mkdir();//创建目录   新建文件夹
		}*/
		
		/*//列出一个目录下的所有文件	
		File f = new File("g:\\");
			
		if (f.isDirectory()) {
			File lists[] = f.listFiles();
			for (int i = 0; i < lists.length; i++) {
				System.out.println("目录名是："+lists[i].getName()+" ,目录路径是："+lists[i].getPath());
			}	
		}*/
		
		
		
	}
}
