package com.file.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {
	/**
	 * 源和目的都是内存
	 * 一般数据都不大
	 * @param args
	 */
	public static void main(String[] args) {
		ByteArrayInputStream bis = new ByteArrayInputStream("asdasd".getBytes());
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int ch = 0;
		while ((ch=bis.read())!=-1) {
			bos.write(ch);
			
		}
		System.out.println(bos.toString());
	}

}
