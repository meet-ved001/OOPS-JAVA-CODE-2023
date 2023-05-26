package com.oops;
import java.util.Scanner;
public class ArrayDemo2 {
public static void main(String[] args) {
	
	int[][] a= new int[3][3];
	int[][] b= new int[3][3];
	int[][] c= new int[3][3];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Now Start A array");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("enter value.. ");
			a[i][j]= sc.nextInt();
		}
		System.out.println();
	}
	
	System.out.println("Now Start B array");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("enter value.. ");
			b[i][j]= sc.nextInt();
		}
		System.out.println();
	}
	System.out.println("Now Start C array");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
//			System.out.println("enter value.. ");
			c[i][j]= a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
