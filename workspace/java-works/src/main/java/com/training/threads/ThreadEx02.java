package com.training.threads;

class MyBusinessLogic2 implements Runnable {

	Thread t;

	public MyBusinessLogic2() {
	}

	public MyBusinessLogic2(String name, int priority) {
		t = new Thread(this, name);
		t.setPriority(priority);
		//  it creates OS level thread and gives control to run()
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Run Method started..." + Thread.currentThread().getName());

		for (int i = 0; i < 100; i++) {
			System.out.println("Value of i is" + i + " in thread " + Thread.currentThread().getName());
		}

		System.out.println("Run Method end..." + Thread.currentThread().getName());
	}
}

public class ThreadEx02 {
	public static void main(String[] args) {

		MyBusinessLogic2 mb1 = new MyBusinessLogic2();

		// internally if the object is instance of thread or runnable
		Thread t1 = new Thread(mb1);

		t1.setPriority(6);
		t1.setName("Shruth");
		t1.start();

		MyBusinessLogic2 mb2 = new MyBusinessLogic2("Namit", 7);
	}
}
