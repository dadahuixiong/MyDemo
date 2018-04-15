package com.file.IO;

import java.io.*;;

/**
 * 图片的读取
 * @author Administrator
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("g:\\1.jpg");
			fos = new FileOutputStream("g:\\1111.jpg");
			
			byte bytes[] = new byte[1024];
			int n = 0;//记录实际读取到的字节数
			
			while ((n=fis.read(bytes))!=-1) {
				//输出到指定文件
				fos.write(bytes);
				
			}		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
