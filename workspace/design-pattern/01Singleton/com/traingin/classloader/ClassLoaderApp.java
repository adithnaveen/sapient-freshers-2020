package com.traingin.classloader;

public class ClassLoaderApp {
	public static void main(String[] args) {
		try {
			Class.forName("com.traingin.classloader.Driver"); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
