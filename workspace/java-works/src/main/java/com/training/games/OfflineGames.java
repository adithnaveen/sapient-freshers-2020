package com.training.games;

import com.training.games.exception.PlayersRequiredException;

public abstract class OfflineGames extends Game {
	private int dimensionLength;
	private int dimensionBredth; 
	private String [] equipments;
	
//	public OfflineGames() {
//	}
	
	public OfflineGames(int dimensionLength,
			 	int dimensionBredth, 
				String[] equipments,  
				int noOfPlayer) {
		super(noOfPlayer);
		this.dimensionLength = dimensionLength;
		this.dimensionBredth = dimensionBredth;
		this.equipments = equipments;
	}
	

	public OfflineGames(int dimensionLength,
			 	int dimensionBredth, 
				String[] equipments,  
				int noOfPlayer, String name) throws PlayersRequiredException {
		super(noOfPlayer, name);
		this.dimensionLength = dimensionLength;
		this.dimensionBredth = dimensionBredth;
		this.equipments = equipments;
	}
	
	public void meetPhysical() {
		System.out.println
		("you have to be in front of person");
	}
 
	
	
}
