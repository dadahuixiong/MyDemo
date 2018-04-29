package com.file.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 获取一个应用程序运行的次数，如果超过5次，给出使用次数已达上限
 * @author Administrator
 *
 */
public class propertiesTest {

	public static void main(String[] args) throws IOException {
		
		getAppConut();
	}

	public static void getAppConut() throws IOException {
		//将配置文件封装成File对象
		File confile = new File("count.properties");
		if(confile.exists()){
			confile.createNewFile();
		}
		FileInputStream fis = new FileInputStream(confile);
		
		Properties prop = new  Properties();
		prop.load(fis);
		
		//从集合中通过键获取次数
		String value = prop.getProperty("time");
		//声明计数器，记录获取到的次数
		int count = 0;
		
		if(value!=null){
			count = Integer.parseInt(value);//把String转成int
			if(count>=5){
				throw new RuntimeException("使用次数已达上限！");
			}
		}
		count++;
		
		//将改变后的次数重新存储到集合中
		prop.setProperty("time", Integer.toString(count));
		
		FileOutputStream fos = new FileOutputStream(confile);
		prop.store(fos, "");
		
		fos.close();
		fis.close();
		
	}

}
