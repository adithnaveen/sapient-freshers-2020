package com.training.bl;

import com.training.games.Game;
import com.training.games.OfflineGames;
import com.training.games.OnlineGames;

// show business logic 
public class PlayGame {

	// [online,offline, online, online]

	// access specifier [private protected default public ]
//	access modifier [static abstract final synchronized] 
//	return type [void/int/float/Employee/Cusotmer] 
//	method name 
//	params
	 
	public static void play(Game game) {
		System.out.println("--------------Common Methods------------------");
		System.out.println("Game Name : " + game.getName());
		game.rule();
		game.start();
		game.stop();
		System.out.println("---------------------------------------------");

		if (game instanceof OnlineGames) {
			((OnlineGames) game).meetVirtual();
		} else if (game instanceof OfflineGames) {
			((OfflineGames) game).meetPhysical();
		}

		System.out.println("================================================");
	}
	
}
