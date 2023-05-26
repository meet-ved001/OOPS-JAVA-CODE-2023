package com.cls;

public class StringDemo {

	public static void main(String[] args) {
		String s1=new String("This is adani power..");
		System.out.println("Original is.."+s1);
		
		System.out.println("Length is.."+s1.length());
		
		System.out.println("Upper case is.."+s1.toUpperCase());
		
		System.out.println("Lower case is.."+s1.toLowerCase());
		
		System.out.println("Substring is.."+s1.substring(2));
		
		System.out.println("Substring is.."+s1.substring(2,4));
		
		System.out.println("CharAt is.."+s1.charAt(2));
		
		if(s1.equals("This is adani power.."))
		{
			System.out.println("Both are equals");
		}
		else
		{
			System.out.println("Both are not equals");

			
		}
		
		
	}
	
}
