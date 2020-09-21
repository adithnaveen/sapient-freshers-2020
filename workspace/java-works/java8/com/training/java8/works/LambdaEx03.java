package com.training.java8.works;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

// function called Runnable 

/*interface  Runnable {
	
	public void run(); 
};*/
public class LambdaEx03 {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("i Value in " + Thread.currentThread().getName() + " is " + i);
				}
			}
		}).start();
////////////////////////////////////////////
		new Thread(() -> {
			IntStream.range(0, 100)
					.forEach((t) -> System.out.println("t value in " + Thread.currentThread().getName() + " is " + t));
		}).start();

////////////////////////////////////////////
		new Thread(() -> {
			IntStream.range(0, 100)
					.forEach(System.out :: println);
		}).start();

		//////////////////////////////////////////
		new Thread(() -> {
			IntStream.range(0, 100).forEach(new IntConsumer() {

				@Override
				public void accept(int value) {
					System.out.println("i Value in " + Thread.currentThread().getName() + " is " + value);
				}
			});
		}).start();

	}
}
