package com.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap stores value in Key and Value pairs, where pair or key must not be unique
HashMap h1 = new HashMap();
System.out.println("Default size is.. "+h1.size());
System.out.println("Default value is.. "+h1);

h1.put(1,"Meet Ved");
h1.put(1,"meet Ved");
h1.put("Meet Ved",1);
h1.put(123, "meet");
h1.put(321, "Ms.Meet Ved ");

System.out.println("Now size is.. "+h1.size());
System.out.println("Now value is.. "+h1);
h1.remove(1);
System.out.println("Now size is.. "+h1.size());
System.out.println("Now value is.. "+h1);
Set set=h1.entrySet();
Iterator i1=set.iterator();
while(i1.hasNext()) {
//	For normal print
//	System.out.println(i1.next()); 
	
//	To separate key and value with ShortCut
	Map.Entry me =(Map.Entry)i1.next();
	System.out.println("Key is.."+me.getKey());
	System.out.println("Value is.."+me.getValue());
	System.out.println();
	
//	How it works in Backend
//	String str = i1.next().toString();
//	String[] s= str.split("=");
//	System.out.println("Key is.."+s[0]);
//	System.out.println("Value is.."+s[1]);
//	System.out.println();
}
	}

}
