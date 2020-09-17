package com.training.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SetEx02 {
	public static void main(String[] args) {
//		HashSet<Stationary> set = new HashSet<Stationary>(); 
		// TreeSet<Stationary> set = new TreeSet<Stationary>();

		TreeSet<Stationary> set = new TreeSet<Stationary>(new Comparator<Stationary>() {

			@Override
			public int compare(Stationary o1, Stationary o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		set.add(new Stationary("Pen", 100));
		set.add(new Stationary("Pencil", 5));
		set.add(new Stationary("Marker", 20));
		set.add(new Stationary("Paper", 10));
		set.add(new Stationary("Paper", 10));
		set.add(new Stationary("Paper", 10));

		for (Stationary temp : set) {
			System.out.println(temp + ", " + temp.hashCode());
		}

	}
}
