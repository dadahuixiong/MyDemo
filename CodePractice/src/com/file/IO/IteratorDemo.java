package com.file.IO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("1");
		coll.add("2");
		coll.add("3");
		coll.add("4");
		/*Iterator it = coll.iterator();
		while (it.hasNext()) {
			if(it.next().equals("1"))
				System.out.println("找到了...");
			
		}*/
		for (Iterator it = coll.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
		
	}

}
