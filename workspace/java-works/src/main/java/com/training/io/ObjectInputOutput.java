package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput {
	
	public static void writeObject (Emp emp) {
		ObjectOutputStream oos = null;
		try {
			 oos = new ObjectOutputStream(new FileOutputStream("emps.ser"));
			
			oos.writeObject(emp);
			oos.writeInt(123);
			
			System.out.println("Data Written... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally  {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void readObjecs() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emps.ser")); 
		
		
		Emp temp = (Emp) ois.readObject(); 
		System.out.println(temp);
		
		int number = ois.readInt();
		System.out.println(number);
		ois.close(); 
	}
	
	
	
	
	public static void main(String[] args) {
		Emp emp = new Emp(101, "Gaurav", 12345); 
		// writeObject(emp);
		
		try {
			readObjecs();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
