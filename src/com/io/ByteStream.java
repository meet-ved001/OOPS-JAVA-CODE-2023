package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
public static void main(String[] args) {
		try  {
			File file = new File("a1.txt");
			FileOutputStream fos = new FileOutputStream(file,true);//true means append the string in the end of file
			String s="This is adani power 4..";
			byte[] b = s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data write");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		try {
			FileInputStream fis = new FileInputStream("a1.txt");
			int x;
			while((x=fis.read())!=-1) {
				System.out.print((char)x);
				}
			fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
}
}
