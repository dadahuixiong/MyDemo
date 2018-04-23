package com.file.IO;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		/* 字符串 -->字节数组:编码
		 * 字符数据-->字符串:解码
		 * 你好 utf-8编码：-28 -67 -96 -27 -91 -67 
		 * 你好 GBK编码：-60 -29 -70 -61 
		 */
		
		String str = "你好";
		//编码
		byte[] buf =  str.getBytes("GBK");//编码
		//printBytes(buf);
		
		
		//解码
		String s1 = new String(buf,"GBK");
		System.out.println("s1="+s1);
		
	}

	public static void printBytes(byte[] buf) {
		for(byte b : buf){
			System.out.print(b+" ");
		}
	}

}
