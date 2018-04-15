package cn.jieshiben;

import java.io.*;


public class FeliDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:\\");
		printf(f);
	
		
	}
	public static void printf(File f){
		if(f!=null){
			if(f.isDirectory()){
				File[] f1 = f.listFiles();
				for (int i = 0; i < f1.length; i++) {
					printf(f1[i]);
				}
			}else{
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}