package com.training.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEx04 {
	public static void main(String[] args) {

		
		try 
		(BufferedReader br = new BufferedReader(new FileReader("emp.txt"))) 
		{
			String temp = "";
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		}
	}
}
