package com.cls;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("This is adani power..");
		System.out.println("Original is.."+s1);
		System.out.println("Length is.."+s1.length());
		
		s1.insert(0, "Hii ");
		System.out.println("Original is.."+s1);
		System.out.println("Length is.."+s1.length());//space is counted here
		
		s1.append("Meet ved..");
		System.out.println("Original is.."+s1);
		System.out.println("Length is.."+s1.length());

		s1.delete(0, 4);
		System.out.println("Original is.."+s1);
		System.out.println("Length is.."+s1.length());

		s1.reverse();
		System.out.println("Reverse is.."+s1);
		System.out.println("Original is.."+s1.reverse());
		System.out.println("Length is.."+s1.length());
		
		
	}
	
	
}
