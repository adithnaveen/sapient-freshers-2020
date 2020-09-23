package com.training.singleton;

public class EagerApp01 {

	public static void main(String[] args) {
		EagerSingleton es = EagerSingleton.getInstance();

		System.out.println("located at " + es.hashCode());

		EagerSingleton es1 = EagerSingleton.getInstance();

		System.out.println("located at " + es1.hashCode());

	}
}
