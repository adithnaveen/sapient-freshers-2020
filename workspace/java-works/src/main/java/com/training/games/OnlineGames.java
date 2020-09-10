package com.training.games;

// TODO - override 
public class OnlineGames extends Game {
	private String userName; 
	private String region;


	public OnlineGames() {
	}
	
	public OnlineGames(String userName,
			String region, int noOfPlayer) {
		super(noOfPlayer);
		this.userName = userName;
		this.region = region;
	}
	
	public void meetVirtual() {
		System.out.println(
				"you can be any where to play");
		
	}

	@Override
	public void start() {
		 System.out.println("in online - to start smile each other.. ");

	}

	@Override
	public void stop() {
		 System.out.println("in online - to stop smile each other.. ");

	}

	@Override
	public void rule() {
		 System.out.println("in online - read manual");

	}
	
}
