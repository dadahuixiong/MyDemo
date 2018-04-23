package com.file.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenInputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 需求：将多个文件中的数据合并到一个文件中
		 * 
		 */
//		Vector<FileInputStream> v = new Vector<FileInputStream>();
//		v.add(new FileInputStream("f:\\1.txt"));
//		v.add(new FileInputStream("f:\\2.txt"));
//		v.add(new FileInputStream("f:\\3.txt"));
//		Enumeration<FileInputStream> en = v.elements();
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for (int i = 1; i <=3; i++) {
			al.add(new FileInputStream("f:\\"+i+".txt"));
		}
		Enumeration<FileInputStream> en = Collections.enumeration(al);//集合util枚举
		
		
		
	/*	
		final Iterator<FileInputStream> it = al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {	
			@Override
			public FileInputStream nextElement() {	
				return it.next();
			}
			@Override
			public boolean hasMoreElements() {	
				return it.hasNext();
			}
		};*/
	
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("f:\\4.txt");
		
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len=sis.read(buf))!=-1) {
			fos.write(buf, 0, len); 
					
		}
		fos.close();
		sis.close();
	}

}
