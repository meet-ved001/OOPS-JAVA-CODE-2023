package com.simple;

public class Piramid2 {

	public static void main(String[] args) {

		
		for(int i=1; i<=5;i++) {
			
//			for(int k=i;k<=5;k++) {
//				System.out.print(" ");
//			}
//			//0 if 14,15,16 not mentioned then left piramid will be printed
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			
			//1 for right piramid
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
			
			//2 for central piramid
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	

}
}