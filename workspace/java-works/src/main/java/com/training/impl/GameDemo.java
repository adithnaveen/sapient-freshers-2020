package com.training.impl;

import com.training.bl.PlayGame;
import com.training.games.Game;
import com.training.games.OfflineGames;
import com.training.games.OnlineGames;

public class GameDemo {
	public static void main(String[] args) 
		throws Exception{
		Game[] games = new Game[5];

		games[0] = new OfflineGames(100, 200, new String[] { "Bat", "Ball" }, 11);
		games[1] = new OnlineGames("Dada Khalandar", "India", 3);
		games[2] = new OnlineGames("Pranavika", "India", 4);
		games[3] = new OfflineGames(100, 100, new String[] { "chess board"}, 2, "C");
		games[4] = new OnlineGames("Namit", "India", 10);
		
		
		for(Game game : games) {
			PlayGame.play(game);
		}
	}
}
