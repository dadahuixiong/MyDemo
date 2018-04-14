package com.file.IO;

import java.io.*;

public class Demo1_2 {

	public static void main(String[] args) {
		
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		File f = new File("g:\\we\\aaa.txt");
		
		try {
			fos = new FileOutputStream(f);
			
			String s = "三国演义\r\n";
			String s1 = "金瓶梅";
			//byte bytes[] = new byte[1024];//定义一个容器
			fos.write(s.getBytes());
			fos.write(s1.getBytes());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
