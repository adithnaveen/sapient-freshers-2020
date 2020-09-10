package com.training.games.specific;

import com.training.games.OfflineGames;
import com.training.games.contract.ICricket;
import com.training.games.exception.PlayersRequiredException;

public class OfflineCricket extends OfflineGames  implements ICricket{

	public OfflineCricket(int dimensionLength, int dimensionBredth, 
			String[] equipments, int noOfPlayer, String name)
			throws PlayersRequiredException {
		super(dimensionLength, dimensionBredth, equipments, noOfPlayer, name);
	}

	@Override
	public void ground() {
		System.out.println("Its diameter varies between 137m and 150m. The ICC Test"
				+ " Match Standard Playing Conditions (October 2014) Law ");
	}

	@Override
	public void batsMen() {
		
		System.out.println("Offline Cricket - Should wear helmet");
			
	}

	@Override
	public void bowler() {
		System.out.println("Offline Cricket - Should Bow with red/white bowl");
	}

	@Override
	public void start() {
		System.out.println("Offline Cricket - by tossing coin");
	}

	@Override
	public void stop() {
		System.out.println("Offline Cricket - based on umpaire decision");
	}

	@Override
	public void rule() {
		System.out.println("Offline Cricket - rule book");
	}

	@Override
	protected void finalize() throws Throwable {
		 System.out.println("hi i'm finalize in offline cricket**********");
	}

}
