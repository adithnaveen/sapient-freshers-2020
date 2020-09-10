package com.training.util;

public class Util {

	
	public static boolean checkNoOfPlayers(Games gameName, int noOfUsers ) {
		
		
		
		if(gameName.equals(Games.CRICKET) && noOfUsers==11) {
			return true; 
		}else if (gameName.equals("ludo") &&  noOfUsers >1 && noOfUsers <4) {
			return true; 
		}
		
		return false; 
	}
	
}
