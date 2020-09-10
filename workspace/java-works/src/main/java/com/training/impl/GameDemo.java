package com.training.impl;

import com.training.bl.PlayGame;
import com.training.games.Game;
import com.training.games.specific.OfflineCricket;
import com.training.games.specific.OnlineCriket;

public class GameDemo {
	public static void main(String[] args) 
		throws Exception{

//		System.runFinalizersOnExit(true);
		
		Game [] games = new Game[2]; 
		
		games[0] = new OnlineCriket("harry", "USA", 3); 
		games[1] = new OfflineCricket(137, 156, new String[] {"Wickets", "Ball", "Bat"}, 11, "Cricket");
		
		for(Game game : games) {
			PlayGame.play(game);
		}
		
		
	}

//	private static void old_method() {
//		Game[] games = new Game[5];
//
//		games[0] = new OfflineGames(100, 200, new String[] { "Bat", "Ball" }, 11);
//		games[1] = new OnlineGames("Dada Khalandar", "India", 3);
//		games[2] = new OnlineGames("Pranavika", "India", 4);
//		games[3] = new OfflineGames(100, 100, new String[] { "chess board"}, 2, "C");
//		games[4] = new OnlineGames("Namit", "India", 10);
//		
//		
//		for(Game game : games) {
//			PlayGame.play(game);
//		}
//	}
}
