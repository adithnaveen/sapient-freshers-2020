package com.training.threads;

public class Quiz extends Thread {
	public void run() {
		while (true) {
			try {
				System.out.println("I'm Worker Thread... ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	public static void main(String args[]) {
		Quiz d = new Quiz();
		d.setDaemon(true);
		d.start();

		char c[] = { 'H', 'E', 'L', 'L', 'O' };

		int i = 0;

		try {
			while (i < 5) {
				System.out.print(c[i++] + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of main method");

	}
}
