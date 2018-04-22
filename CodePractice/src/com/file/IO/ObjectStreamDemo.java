package com.file.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException {
		writeObj();
	}

	public static void writeObj() throws IOException, IOException {
		/*对象的序列化， 对象持久化
			被序列化的对象必须实现Serializable接口
		*/
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
		
		oos.writeObject(new Person("小强",20)); 
		
		oos.close();
		 
	}

}
