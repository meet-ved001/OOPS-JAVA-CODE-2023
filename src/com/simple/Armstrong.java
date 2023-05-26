package com.simple;

public class Armstrong {
public static void main(String[] args) {
	int no=153,sum=0;
	int copy=no;
	
	while(no>0) {
		int t=no%10;
		sum=sum+(t*t*t);
		no=no/10;
	}
	if(copy==sum) {
		System.out.println("Entered number is armstrong... "+sum);
	}else {
		System.out.println("Entered number is not an armstrong... "+sum);
	}
}
}
