package com.training.collections;

import java.util.PriorityQueue;

public class SetEx03 {
	public static void main(String[] args) {
		
		PriorityQueue<Stationary> set  = new PriorityQueue<Stationary>(); 

		set.offer(new Stationary("Pen", 100));
		set.offer(new Stationary("Pencil", 5));
		set.offer(new Stationary("Marker", 20));
		set.offer(new Stationary("Paper", 10));
		set.offer(new Stationary("Paper", 10));
		set.offer(new Stationary("Paper", 10));
	
		while(!set.isEmpty()) {
			Stationary temp = set.poll();
			System.out.println(temp);
		}
	
	}
}
