package com.io;
import java.io.File;
class FDemo{
	File file;
	public FDemo() {
		// TODO Auto-generated constructor stub
		file = new File("a3.txt");
		try {
			file.createNewFile();
			display();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private void display()
	{
		System.out.println("is directory or not.."+file.isDirectory());
		System.out.println("is file or not.."+file.isFile());
		System.out.println("can I read or not.."+file.canRead());
		System.out.println("can I write or not.."+file.canWrite());
		System.out.println("can I execute or not.."+file.canExecute());
		System.out.println("File Name.."+file.getName());
		System.out.println("File Path.."+file.getPath());
		System.out.println("File Abpath.."+file.getAbsolutePath());
	}
}
public class FileDemo {
public static void main(String[] args) {
	new FDemo();
}
}
