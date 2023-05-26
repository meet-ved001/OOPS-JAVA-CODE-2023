package com.simple;


public class DataTypeDemo {

	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			int i1=10; //4bytes
			long l1=1000;//8bytes
			byte b1=127; //1 byte
			char c1= 'R'; //2byte
			float f1= 45.65f; //4 byte
			double d1= 78987.57; //8 byte
			boolean bb= true; //1 bit
			
			System.out.println("int is.."+i1);
			System.out.println("long is.."+l1);
			System.out.println("byte is.."+b1);
			System.out.println("char is.."+c1);
			System.out.println("float is.."+f1);
			System.out.println("double is.."+d1);
			System.out.println("boolean is.."+bb);
			
			System.out.println("int bytes are... "+Integer.BYTES+" bytes");
			System.out.println("long bytes are... "+Long.BYTES+" bytes");

			
		}
	

}
