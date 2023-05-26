package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet stores the value in hash format and then it convert it into hash code and values are displayed using hash code form.
		//Also, it does not contains duplicate values.
HashSet h1 = new HashSet();
System.out.println("Default size is.. "+h1.size());
System.out.println("Default value is.. "+h1);
h1.add(12345);
h1.add("Meet");
h1.add("A");
h1.add(45.65f);
h1.add(new Integer(100));
h1.add("Meet");
h1.add("meet");
System.out.println("Now size is.. "+h1.size());
System.out.println("Now value is.. "+h1);

//remove won't work in HashSet because of Hash Memory
//h1.remove(0);
//System.out.println("Now size is.. "+h1.size());
//System.out.println("Now value is.. "+h1);

h1.remove("Meet");
System.out.println("Now size is.. "+h1.size());
System.out.println("Now value is.. "+h1);
////Using iterator we can print values in row
Iterator i1=h1.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}

}
