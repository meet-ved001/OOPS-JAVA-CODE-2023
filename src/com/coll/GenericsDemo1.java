package com.coll;

import java.util.ArrayList;

public class GenericsDemo1 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	System.out.println("Default size is.."+a1.size());
	System.out.println("Default capacity is.."+a1);
	a1.add(123);
	a1.add(new Integer(100));
	System.out.println(a1);

	
}
}
