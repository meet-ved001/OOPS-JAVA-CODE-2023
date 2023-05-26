package com.oops;

public class JaggedArray {
public static void main(String[] args) {
	int[][] a=new int[3][];
	a[0]= new int[31];
	a[1]=new int[30];
	a[2]= new int[29];
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]= j+1;
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
