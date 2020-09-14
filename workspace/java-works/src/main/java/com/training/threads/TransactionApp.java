package com.training.threads;

public class TransactionApp implements Runnable {
	private Account account;
	private int amount;

	public TransactionApp(Account account , int amount, String name ) {
		this.account = account; 
		this.amount = amount; 
		new Thread(this, name).start();  
		
	}
	
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		new TransactionApp(account, 500, "Harry");
		new TransactionApp(account, 750, "Barry");
	}

	@Override
	public void run() {
		
		synchronized (account) {
			account.withDraw(amount);
		}
	}
}
