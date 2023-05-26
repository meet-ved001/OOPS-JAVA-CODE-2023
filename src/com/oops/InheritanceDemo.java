package com.oops;

class Student1{
	int sid;
	String sname,subject;
	public Student1() {
		System.out.println("Student class constructor");
	}
	public void setStudentData() {
		sid=1;
		sname="meet";
		subject="Java";
	}
}

class Sport extends Student1{
	String spname;
	public Sport() {
		System.out.println("Sport class constructor");
	}
	public void setSportData() {
		spname="cricket";
	}
}

class Result extends Sport{
	String grade;
	public Result() {
		System.out.println("Result class constructor");
	}
	public void setResultData() {
		grade="A+";
	}
	public void display() {
		System.out.println("sid is.."+sid);
		System.out.println("sname is.."+sname);
		System.out.println("subject is.."+subject);
		System.out.println("spname is.."+spname);
		System.out.println("grade is.."+grade);
	}
}


public class InheritanceDemo {
public static void main(String[] args) {
	Result s1=new Result();
	s1.setStudentData();
	s1.setSportData();
	s1.setResultData();
	s1.display();
}
}
