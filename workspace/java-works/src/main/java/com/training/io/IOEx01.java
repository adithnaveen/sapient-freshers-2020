package com.training.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// to check file properties 
public class IOEx01 {
	public static void main(String[] args) throws IOException {
		// this the reference to the file
		File file = new File("sample.txt");

		if(file.exists()) {
			System.out.println("File exists.. ");
		}else  {
			System.out.println("Sorry file not found ");
			file.createNewFile(); 
		}

		System.out.println("File absoloute path : " + file.getAbsolutePath());
		System.out.println("Last modified : " + new Date(file.lastModified()));
		System.out.println("isFile : "+file.isFile());
		System.out.println("isRead : " + file.canRead());
		
	}
}
