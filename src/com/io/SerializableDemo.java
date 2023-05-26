// Used to encrypt the data
package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
public static void main(String[] args) {
	SerializableDemo s1 = new SerializableDemo();
	s1.setSerializableData();
}

public void setSerializableData() {
	// TODO Auto-generated method stub
	Address address = new Address();
	address.setCountry("India");
	address.setState("Gujarat");
	address.setCity("Ahmedabad");
	
	try
	{
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(address);
		oos.flush();
		fos.flush();
		fos.close();
		System.out.println("Data write..");
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
