package com.oops;


class Sum {
	int x;
	int y;
	public Sum() {
		x=10;
		y=20;
		System.out.println("1st sum "+(x+y));
	}
	public Sum(int a) {
		x=a;
		y=a;
		System.out.println("1st sum "+(x+y));
	}
	public Sum(int a,int b) {
		x=a;
		y=b;
		System.out.println("1st sum "+(x+y));
	}
}

public class ConstructorDemo {
public static void main(String[] args) {
	new Sum();
	new Sum(10);
	new Sum(50,10);
}
}
