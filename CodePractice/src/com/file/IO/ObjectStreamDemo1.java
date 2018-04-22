package com.file.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		readObj();
	}

	public static void readObj() throws IOException, IOException, ClassNotFoundException {
		/*	对象的反序列化
		 * */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		
		Person p = (Person)ois.readObject();
		
		System.out.println(p.getName()+":"+p.getAge());
	}

}
