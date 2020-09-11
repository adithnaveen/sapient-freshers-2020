package com.training.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class SortingObjects1 {
	public static void main(String[] args) {
		
		Devices devs [] = new Devices [] {
				new Devices(101, "monitor", 3434), 
				new Devices(45, "mouse", 7), 
				new Devices(67, "mobile", 30000), 
				new Devices(11, "adaptor", 100)
		};
		
	 
		Arrays.sort(devs,  new Comparator<Devices>() {
			
			@Override
			public int compare(Devices o1, Devices o2) {
				return o1.getdId() - o2.getdId(); 
			}
		});
	}
}
