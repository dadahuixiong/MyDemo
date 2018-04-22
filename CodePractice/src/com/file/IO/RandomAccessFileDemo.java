package com.file.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		
		//writeFile();
		readFile();
		
	}

	public static void readFile() throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.xtx", "rw");
		
		raf.seek(1*8);//通过seek设置指针的位置
		
		byte[] buf = new byte[4];
		raf.read(buf);
		String name = new String(buf);
		
		int age = raf.readInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		
		raf.close();
	}

	private static void writeFile() throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.xtx", "rw");
		raf.write("张三".getBytes());
		raf.writeInt(97);
		raf.write("李四".getBytes());
	
		raf.close();
	}

}
