package com.coll;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
Vector v1 = new Vector(2,1);//2,1 is not compulsory
System.out.println("Default size is.."+v1.size());
System.out.println("Default capacity is.."+v1.capacity());
System.out.println("Default value is.."+v1);

v1.addElement(10);
v1.add(105.65f);
v1.add('M');
v1.add("Meet");
v1.add(new Integer(1000));
v1.add("Meet");

System.out.println("Now size is.."+v1.size());
System.out.println("Now capacity is.."+v1.capacity());
System.out.println("Now value is.."+v1);

v1.remove("Meet");

System.out.println("Now size is.."+v1.size());
System.out.println("Now capacity is.."+v1.capacity());
System.out.println("Now value is.."+v1);

Enumeration e1 = v1.elements();
while(e1.hasMoreElements()) {
	System.out.println(e1.nextElement());
}
Iterator i1 = v1.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}

}
