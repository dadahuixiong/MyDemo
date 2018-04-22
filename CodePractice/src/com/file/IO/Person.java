package com.file.IO;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * transient : 非静态数据不想被序列化可以使用这个关键字修饰
	 * Serializable : 对象属性改变，序列号不变；可以反序列化
	 * 				  对象序列号最好显示声明。
	 */
	private static final long serialVersionUID = 9527l;
	private transient String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
}
