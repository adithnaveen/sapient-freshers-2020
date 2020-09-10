package com.training.games;

import com.training.games.exception.PlayersRequiredException;

// this class to have validation for no of players, and name of the game 


public abstract class Game {
	private String name;
	private int noOfPlayer;

	public Game() {

	}

	public int getNoOfPlayer() {
		return noOfPlayer;
	}

	public Game(int noOfPlayer) {
		this.name = "No Name";
		this.noOfPlayer = noOfPlayer;
	}

	public Game(int noOfPlayer, String name)
		throws PlayersRequiredException{

		// if you have checked exception throw then you should
		// always surround with try catch block
		// if not use throws clause so that the caller will handle 
		if (noOfPlayer <= 0) {
				throw new PlayersRequiredException
					("Sorry Numver of players not matching " + noOfPlayer);
		}

		if (name.length() < 5) {

			try {
				throw new RuntimeException("Sorry Name Cannot Be Less Than 5 Chars");
			} catch (RuntimeException rte) {
				rte.printStackTrace();
				this.name = "No Name ";
			}
		} else {
			this.noOfPlayer = noOfPlayer;
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	// concrete {} - abstract
	public abstract void start();

	public abstract void stop();

	public abstract void rule();

}
