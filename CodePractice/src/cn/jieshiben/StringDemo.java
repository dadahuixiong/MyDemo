package cn.jieshiben;

public class StringDemo {

	public static void main(String[] args) {
		stringConstructorDemo();		
		
	}

	public static void stringConstructorDemo() {
		
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println(s1);
	}

}
