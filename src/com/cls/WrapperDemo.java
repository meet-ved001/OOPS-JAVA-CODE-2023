package com.cls;

class Student
{
	public void show()
	{
		
	}
}

public class WrapperDemo {
public static void main(String[] args) {
	//1
	Integer i1 = new Integer(123);
	System.out.println("Autoboxing is.."+i1);
	//2
	int a=100;
	Integer i2 = new Integer(a);
	System.out.println("Boxing is.."+i2);
	//3
	int x=i1.intValue(); //.intValue is not compulsory, hence java is not pure oops
	System.out.println("Unboxing is.."+x);
	//3
	String s="786";
	int z=Integer.parseInt(s);
	System.out.println("Unboxing is.."+z);
	
	//4
	Object o1=new Object();
	Student s1=new Student();
	
	
}
}
