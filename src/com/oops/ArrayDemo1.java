package com.oops;
import java.util.Scanner;


public class ArrayDemo1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a=new int[5];
	for(int i=0;i<5;i++) {
		System.out.println("Enter value.. "+(i+1));
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<5;i++) {
		System.out.println(a[i]);
	}
}
}
