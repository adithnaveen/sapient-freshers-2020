package com.training.games;

// TODO - override 
public  abstract class OnlineGames extends Game {
	private String userName; 
	private String region;


//	public OnlineGames() {
//	}
	
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
 
	
}
