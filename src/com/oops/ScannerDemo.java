package com.oops;
import java.util.Scanner;
public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num1: ");
	int num1 = sc.nextInt();
	System.out.println("enter num2: ");
	int num2 = sc.nextInt();
	
	System.out.println("sum is:- "+ (num1+num2));
}
}