package com.ex;

import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
	try {
//		int x=123123123123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1 :");
		int a=sc.nextInt();
		
		System.out.println("Enter no 2 :");
		int b=sc.nextInt();
		int c = a/b;
		System.out.println("your division is.."+c);
		System.out.println("Program is completed..");
	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(e);
		e.printStackTrace();
	}
	catch(Exception e) {
//		System.out.println(e);
		e.printStackTrace();
	}
//	Exception in thread "main": it means error given my compiler machine
	finally
	{
		System.out.println("Project was made by...");
		System.out.println("Meet Ved...");
		System.out.println("191310132017...");
		
	}
}
}
