package com.training.threads;

public class Account {
	private int money; 
	
	// the data is got from DB 
	public Account(int money) {
		this.money = money; 
	}
	
	public  void withDraw(int amount) {
		if(amount < money) {
			try {
				Thread.sleep(1000);
				this.money = this.money - amount; 
			} catch (InterruptedException e) {}
			
			System.out.println("Received Money " + amount +" available Balace is " + money );
		}else {
			System.out.println("Sorry Mr/Ms/Mrs: " + Thread.currentThread().getName() +" No Balance"); 
		}
		
		System.out.println("Current Balance in System : " + money);
		
	}
}
