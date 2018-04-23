package com.file.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {
	/**
	 * PrintWriter 字符打印流
	 * 构造函数参数:
	 * 1.字符串路径 2。File对象 3。字节输出流4。字符输出流
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"),true);
		String line = null;
		while ((line=bufr.readLine())!=null) {
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
			//out.flush();
		}
		out.close();
		bufr.close();
	
	}

}
