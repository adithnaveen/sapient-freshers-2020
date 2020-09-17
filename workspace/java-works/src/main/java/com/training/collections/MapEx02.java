package com.training.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MapEx02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties(); 
		
		prop.load(new FileReader(new File("src/main/resources/db.properties")));
		
		System.out.println(prop.get("uname"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("location"));
	}
}
