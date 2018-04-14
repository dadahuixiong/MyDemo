package com.file.IO;

import java.io.*;

public class Demo1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		File f = new File("g:\\we\\aaa.txt");
		
		try {
			 fis = new FileInputStream(f);//读取f内容
			
			//定义一个字节数组,相当于缓存
			byte bytes[] = new byte[1024];
			
			int n = 0; //得到实际读取到得字节数
				
			while ((n=fis.read(bytes))!=-1) {
				//把字节转成String
				String s = new String(bytes,0,n);
				System.out.println(s);
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				
				
				e.printStackTrace();
			}
		}
	
	}

}
