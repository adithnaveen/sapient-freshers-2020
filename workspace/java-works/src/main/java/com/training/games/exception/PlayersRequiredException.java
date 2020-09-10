package com.training.games.exception;

public class PlayersRequiredException extends Exception {

	private String message; 
	
	
	public PlayersRequiredException() {
		this.message = "Players Not Found"; 
	}
	
	public PlayersRequiredException (String message) {
		this.message = message; 
	}

	@Override
	public String toString() {
		return "PlayersRequiredException [message=" + message + "]";
	}

	@Override
	public String getMessage() {
		return "getMessage :" + this.message; 
	}
}

