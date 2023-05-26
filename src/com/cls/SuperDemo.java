package com.cls;
class First
{
 int no;
 String name;
 public First()
 {
 	System.out.println("This is First class demo..");
 }
 public void setData(int no,String name)
 {
 this.no=no;
 this.name=name;
 }
}

class Second extends First
{
int no;
public Second()
    {
	super();//here super is optional
	System.out.println("This is Second class demo..");
	}
public void display() {
	super.setData(17, "meet");//here super is optional
	System.out.println("no is.."+super.no);
	System.out.println("name is.."+name);
}
}
public class SuperDemo {
public static void main(String[] args) {
	Second s1 = new Second();
//	s1.setData(123,"meet1");
	s1.display();
}
}
