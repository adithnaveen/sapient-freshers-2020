package com.training.exception;

public class ExceptionEx01 {
	public static void main(String[] args) {

		// 1. 10 / 5

		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			try {
				int arr[] = new int[-5];
			} catch (NegativeArraySizeException e) {
				System.out.println(e);

				try {
					if (num2 == 0)
						throw new RuntimeException("I'm her for testing");
				} catch (RuntimeException rte) {
					rte.printStackTrace();
				}
			}

			int res = num1 / num2;
			System.out.println("Result is  :" + res);
			// exception has got capability to handle anything and everything

			return;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (Exception e) {
			System.out.println("Sorry please contact admin : " + e.getMessage());
		} finally {
			System.out.println("I'm always there... ");
		}

		System.out.println("i'm still there... last line... ");
	}
}
