// Used to decrypt the data

package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializableDemo {
public static void main(String[] args) {
	DeserializableDemo d1 = new DeserializableDemo();
	Address address = d1.getDeserialzableData();
	System.out.println(address);
}
public Address getDeserialzableData()
{
	Address address = null;
	try {
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		address = (Address)ois.readObject();
		fis.close();

	}catch(Exception e) {
		e.printStackTrace();
	}
	return address;
	
}
}
