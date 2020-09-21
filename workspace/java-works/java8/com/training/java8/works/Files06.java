package com.training.java8.works;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files06 {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null; 
		try {
			 fw = new FileWriter(new File("sample.txt")); 
			 bw = new BufferedWriter(fw);
			
			 bw.write("Hello ");
			 bw.newLine(); 
			 bw.write("how Are You");
			 bw.newLine(); 
			
			 System.out.println("Data Written to file.. ");
		} catch (IOException e) {
			e.printStackTrace();
 		} finally {
 			try {
 				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
 		}
		
		
		//in java 8 way 
		
		
		try (
				FileWriter fw1 = new FileWriter(new File("sample1.txt")); 
				BufferedWriter bw1 = new BufferedWriter(fw1);
				) {
			 bw1.write("Hello ");
			 bw1.newLine(); 
			 bw1.write("how Are You");
			 bw1.newLine(); 
			 bw1.write("new content... ");
			 bw1.newLine(); 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
