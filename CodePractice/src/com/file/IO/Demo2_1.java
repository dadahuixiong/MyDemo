package com.file.IO;

import java.io.*;

/**
 * 文件字符流demo
 * @author Administrator
 *
 */
public class Demo2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileReader fr = null;
			FileWriter fw = null;
			
			try {
				fr = new FileReader("g:\\aaa.txt");
				fw = new FileWriter("g:\\bbb.txt");
				char c[] = new char[1024];
				int n = 0; //记录实际读取到的字符数
				
				while ((n=fr.read(c))!=-1) {
//					String s = new String(c,0,n);
//					System.out.println(s);
					fw.write(c,0,n);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					fr.close();
					fw.close();
				} catch (IOException e) {
					
					
					e.printStackTrace();
				}
				
			}
			
	}

}
