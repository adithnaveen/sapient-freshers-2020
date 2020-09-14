package com.training.threads;

class MyBusinessLogic extends Thread{
	
	@Override
	public void run() {
		System.out.println("Run Method started...");
		
		for(int i=0; i<100; i++) {
			System.out.println("Value of i is" + i +" in thread " + Thread.currentThread().getName());
		}
		
		System.out.println("Run Method end...");
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// MAX = 10 
		// MIN = 1 
		// NORM = 5
		System.out.println(Thread.currentThread().getPriority());
		
		MyBusinessLogic mbl = new MyBusinessLogic(); 
		
		// it will create OS Level thread on behalf of JAVA and invoke run() method 
		mbl.start(); 
		
		MyBusinessLogic mbl2 = new MyBusinessLogic();
		mbl2.setName("Chandan"); 
		mbl2.start(); 
		
		MyBusinessLogic mbl3 = new MyBusinessLogic();
		mbl3.setPriority(mbl2.getPriority()+2);
		mbl3.setName("Akashdeep");; 
		mbl3.start(); 
		
		MyBusinessLogic mbl4 = new MyBusinessLogic(); 
		mbl4.setPriority(Thread.MAX_PRIORITY); 
		mbl4.setName("Ashutosh"); 
		mbl4.start(); 
		
		
		try {
			mbl.join();
			mbl2.join();
			mbl3.join();
			mbl4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of main... ");
	}
}















