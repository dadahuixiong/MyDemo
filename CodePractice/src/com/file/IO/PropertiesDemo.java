package com.file.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		//propertiesDemo();
		//propertiesAndStreamDemo();
		//savePropertiesDemo();
		//methodDemo();
		//MyLoad();
		updateInfo();
	}
	
	/**
	 * 对已有的配置文件中的信息进行修改
	 * @throws IOException 
	 */
	public static void updateInfo() throws IOException {
		//读取文件
		File file = new File("g:"+File
				.separator+"info.txt");
		if(file.exists()){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		
		//创建集合
		Properties prop = new Properties();
		
		//将流中的信息存储到集合中
		prop.load(fr);
		prop.setProperty("wangbaoqiang02", "100");
		
		
		//输出流
		FileWriter fw = new FileWriter(file);
		
		prop.store(fw, "");
		
		
		//prop.list(System.out);
		
		fr.close();
		fw.close();
	}

	/**
	 * 模拟load方法
	 * @throws IOException 
	 */
	public static void MyLoad() throws IOException {
		Properties prop = new Properties();
		BufferedReader bufr = new BufferedReader(new FileReader("g:"+File
				.separator+"info.txt"));
		String line = null;
		
		while ((line=bufr.readLine())!=null) {
			
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("=");
			//System.out.println(arr[0]+" : "+arr[1]);
			prop.setProperty(arr[0], arr[1]);
		}
		prop.list(System.out);
		bufr.close();
	}



	/**
	 * 集合中的数据来自一个文件
	 * 必须保证该文件中的数据是键值对
	 * 需要使用到读取流     从流中获取
	 * @throws IOException 
	 */
	public static void methodDemo() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("g:"+File
				.separator+"info.txt");
		
		prop.load(fis);
		prop.list(System.out);
			
	}

	/**
	 * 将集合中的字符串键值持久化，需要关联输出流(字节流，字符流)
	 * @throws IOException 
	 */
	public static void savePropertiesDemo() throws IOException {
		Properties prop = new Properties();
		prop.setProperty("wangbaoqiang01", "30");
		prop.setProperty("wangbaoqiang02", "31");
		prop.setProperty("wangbaoqiang03", "32");
		prop.setProperty("wangbaoqiang04", "33");
		
		FileOutputStream fos = new FileOutputStream("g:"+File
				.separator+"info.txt");
		
		//将集合数据存储到文件
		prop.store(fos, "nifo");
		fos.close();
		
	}

	/**
	 * Properties集合和流对象相结合的功能
	 */
	public static void propertiesAndStreamDemo() {
		Properties prop = new Properties();
//		prop.setProperty("王宝强1", "30");
//		prop.setProperty("王宝强2", "31");
//		prop.setProperty("王宝强3", "32");
//		prop.setProperty("王宝强4", "33");
		prop = System.getProperties();
		prop.list(System.out);
		
	}

	/**
	 * Properties集合的存和取
	 */
	public static void propertiesDemo() {
		Properties prop = new Properties();
		prop.setProperty("王宝强1", "30");
		prop.setProperty("王宝强2", "31");
		prop.setProperty("王宝强3", "32");
		prop.setProperty("王宝强4", "33");
		
		//修改元素：键相同，值覆盖
		prop.setProperty("王宝强1", "11");
		
		//取出所有元素 
		Set<String> names = prop.stringPropertyNames();
		
		for(String name : names){
			String value = prop.getProperty(name);
			System.out.println(name+" : "+value);
		}
		
	}
	
}
