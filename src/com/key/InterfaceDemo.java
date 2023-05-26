package com.key;

class Result
{
String grade;
public void setResultData()
 {
grade="A+";	
 }
}

class Staff extends Result implements Student,Abc
{
String stname;
public void setData() {
	stname="Meet ved";
}

@Override
public void show() {
	// TODO Auto-generated method stub
	System.out.println("sid is.."+sid);
	System.out.println("stname is.."+stname);
	System.out.println("Grade is.."+grade);
	System.out.println("A is.."+a);
}

}

public class InterfaceDemo {
	public static void main(String[] args) {
		Staff s1=new Staff();
		Student.display();
		s1.setData();
		s1.setResultData();
		s1.show();
	}

}
