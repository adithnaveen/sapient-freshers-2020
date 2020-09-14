package com.training.io;

import java.io.File;

public class IOEx02 {
	public static void main(String[] args) {
		
		File file = new File("sample"); 
		System.out.println(file.isDirectory());
		
		String [] files = file.list(); 
		
		for(String temp : files) {
			System.out.println(temp);
		}
		
		// to list only files 
		System.out.println("List of files...........");
		for(File f : file.listFiles()) {
			if(f.isFile()) {
				System.out.println(f.getName());
			}
		}
	}
}
