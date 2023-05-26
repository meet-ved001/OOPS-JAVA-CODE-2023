package com.oops;
class Student{
	int sno;
	String sname,city, degree;
	
	public void setDataValue() {
		sno=123;
		sname="meet";
		city="ahmedabad";
		degree="B.tech";
	}
	
	public void display() {
		System.out.println("-----------------");
		System.out.println("sno is .."+sno);
		System.out.println("sname is .."+sname);	
		System.out.println("city is .."+city);
		System.out.println("degree is .."+degree);
		System.out.println("-----------------");

	}
}
public class ClassDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		s1.setDataValue();
		s1.display();
	}
}

