package com.training.java8.works;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilexRead07 {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (

				FileReader fr = new FileReader("sample1.txt");
				BufferedReader br = new BufferedReader(fr);

		) {
			br.lines().forEach(System.out :: println);
		}
		
		System.out.println("-----------------------------------");
		
		try (Stream<String> st = Files.lines(Paths.get("sample1.txt"))) {
			st.forEach(System.out :: println);
		}
	}
}
