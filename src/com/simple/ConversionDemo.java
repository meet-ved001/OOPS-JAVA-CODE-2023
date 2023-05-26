package com.simple;

public class ConversionDemo {

	public static void main(String[] args) {
		int i1=10;//4 bytes
		long l1;//8 bytes
		l1=i1;
		System.out.println("Implicit conversion means automatic conversion:- "+l1);
		
		int x;
		x=(int)l1; //Explicit conversion
		System.out.println("Explicit conversion means manual conversion:- "+x);

		int z=512;
		byte b= (byte)z;
		System.out.println(b);
	}

}
