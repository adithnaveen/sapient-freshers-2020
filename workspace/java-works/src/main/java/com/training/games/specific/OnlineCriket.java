package com.training.games.specific;

import com.training.games.OnlineGames;
import com.training.games.contract.ICricket;

public class OnlineCriket extends OnlineGames implements ICricket {

	int x; 
	
	public OnlineCriket(String userName, String region, int noOfPlayer) {
		super(userName, region, noOfPlayer);
		// check only x 
	}

	@Override
	public void ground() {
		System.out.println("Online Cricket - Multiple size ground ");
	}

	@Override
	public void batsMen() {
		System.out.println("Online Cricket - can play without gaurds");
	}

	@Override
	public void bowler() {
		System.out.println("Online Cricket - bowler bowls ");
	}

	@Override
	public void start() {
		System.out.println("Online Cricket - starts by dice");
	}

	@Override
	public void stop() {
		System.out.println("Online Cricket - when you exit");
	}

	@Override
	public void rule() {
		System.out.println("Online Cricket -  customized rule... ");
	}

}
