package com.file.IO;

import java.io.*;

/**
 * 缓冲字符流demo
 * @author Administrator
 *
 */
public class BufferedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			FileReader fr = new FileReader("g:\\aaa.txt");
			FileWriter fw = new FileWriter("g:\\bbb1.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String s = "";
			while ((s=br.readLine())!=null) {
				//System.out.println(s);
				bw.write(s);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			 try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
