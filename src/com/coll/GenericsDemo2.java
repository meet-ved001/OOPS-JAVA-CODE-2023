package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 {
public static void main(String[] args) {
	ArrayList<Student> a1 = new ArrayList<Student>();
	
	Student s1=new Student();
	s1.setSid(1);
	s1.setSname("Meet");
	s1.setCity("Ahmedabad");
	
	Student s2=new Student();
	s2.setSid(2);
	s2.setSname("Ved Meet");
	s2.setCity("Rajkot");
	
	a1.add(s1);
	a1.add(s2);
	System.out.println(a1);
	
	Iterator<Student> i1 = a1.iterator();
	while(i1.hasNext()) {
		Student s = i1.next();
//		System.out.println(i1.next());to print address values in rows
		System.out.println("Sid is.."+s.getSid());
		System.out.println("Sname is.."+s.getSname());
		System.out.println("City is.."+s.getCity());
		System.out.println();
	}
}
}
