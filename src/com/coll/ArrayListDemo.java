package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
//	ArrayList contains duplicate values an print the values in same order as inserted.
	ArrayList a1 = new ArrayList();
	System.out.println("Default size is.. "+a1.size());
	System.out.println("Default value is.. "+a1);
	a1.add(12345);
	a1.add("Meet");
	a1.add("A");
	a1.add(45.65f);
	a1.add(new Integer(100));
	a1.add("Meet");
	System.out.println("Now size is.. "+a1.size());
	System.out.println("Now value is.. "+a1);
	
	a1.remove(0);
	System.out.println("Now size is.. "+a1.size());
	System.out.println("Now value is.. "+a1);
	
	a1.remove("Meet");
	System.out.println("Now size is.. "+a1.size());
	System.out.println("Now value is.. "+a1);
//	Using iterator we can print values in row
	Iterator i1=a1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
}
}
