package com.oops;

import java.util.Scanner;

public class ScannerDemo2 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);

	System.out.println("Enter no: ");
	int no = sc.nextInt();
	System.out.println("enter first  name: ");
//	String name = sc.next();
//	sc.nextLine();
//	String name = sc.nextLine();
	String name = sc1.nextLine();

	System.out.println("your no:-  "+no);
	System.out.println("your name:- "+name);
}
}
