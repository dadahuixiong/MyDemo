package com.file.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 需求：建立一个指定扩展名的文件列表
 * 思路：
 * 	1 进行深度遍历
 *  2. 在遍历过程中进行过滤,将符合条件的内容存储到容器中
 *  3. 对容器中的内容进行遍历,并将绝对路径写入到文件中
 * @author Administrator
 *
 */

public class Test0423 {
	public static void main(String[] args) {
		File dir = new File("f:"+File.separator);//声明源
		
		FilenameFilter filter = new FilenameFilter() {//创建过滤器
			@Override
			public boolean accept(File dir, String name) {	
				return name.endsWith(".java");//指定过滤条件	
			}
		};
		
		List<File> list = new ArrayList<File>();//创建容器对象
		
		getFiles(dir, filter, list);
		File destFile = new File(dir,"javalist.txt");//指定文件位置和文件名
		writeToFile(list,destFile);
		
	}
	
	/**
	 * 把容器中的数据写入指定文件
	 * @param list
	 * @param destFile
	 */
	public static void writeToFile(List<File> list,File destFile) {
		BufferedWriter bufw = null;	
				try {
					bufw = new BufferedWriter(new FileWriter(destFile));
					for(File file : list){
						bufw.write(file.getAbsolutePath());
						bufw.newLine();//换行
						bufw.flush();//刷新
					}	
				} catch (IOException e) {
					throw new RuntimeException("写入失败。。。。");
				}finally{
					if(bufw!=null){
						try {
							bufw.close();
						} catch (IOException e) {
							throw new RuntimeException("关闭流失败。。。。");
						}
					}
				}
	}

	/**
	 * 对指定目录中的内容进行深度遍历，并按照指定过滤器，进行过滤
	 * 将过滤后的内容存储到指定容器list中
	 * @param dir	目录
	 * @param filter	过滤器
	 * @param list	
	 */
	public static void getFiles(File dir, FilenameFilter filter,List<File> list) {
		File[] files = dir.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				//递归
				getFiles(file,filter,list);
			}else{
				//对遍历到的文件进行过滤器的过滤，将符合条件的文件存储的到list中
				if(filter.accept(dir, file.getName())){
					list.add(file);
				}
			}
		}
	
	}
}
