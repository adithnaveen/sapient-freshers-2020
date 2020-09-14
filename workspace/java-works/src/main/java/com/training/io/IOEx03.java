package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx03 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Emp Id : ");
			int empId = Integer.parseInt(br.readLine());

			System.out.println("Enter Emp Name : ");
			String empName = br.readLine();

			System.out.println("Emp Salary : ");
			double empSal = Double.parseDouble(br.readLine());

			display(empId, empName, empSal);

			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(new File("emp.txt"), true));

				bw.write("empId=" + empId + "\n");
				bw.write("empName=" + empName + "\n");
				bw.write("empSal=" + empSal + "\n");

				System.out.println("content written to file... ");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				bw.close();
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void display(int empId, String empName, double empSal) {
		System.out.println("Emp Id:" + empId);
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp Sal :" + empSal);
	}
}
