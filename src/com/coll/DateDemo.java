package com.coll;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) {
	Date d1 = new Date();
	System.out.println(d1);
System.out.println("current date is.."+d1.getDate());
SimpleDateFormat f1=new SimpleDateFormat("HH: mm: a");
System.out.println(f1.format(d1));
//MM means month, while mm means minutes 
SimpleDateFormat f2=new SimpleDateFormat("EEE,dd/MM/yyyy");
System.out.println(f2.format(d1));

}
}
