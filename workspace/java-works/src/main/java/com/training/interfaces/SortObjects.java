package com.training.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class SortObjects {
	public static void main(String[] args) {
		Devices devs [] = new Devices [] {
				new Devices(101, "monitor", 3434), 
				new Devices(45, "mouse", 7), 
				new Devices(67, "mobile", 30000), 
				new Devices(11, "adaptor", 100)
		};
		Arrays.sort(devs);
		
		for(Devices temp : devs) {
			System.out.println(temp);
		}
		
		System.out.println("****Sorting based on cost***");
//		Comparator<Devices> costComparator = new SortingDevices(); 
//		Arrays.sort(devs, SortingDevices.ascDevicesCost());
//		Arrays.sort(devs, SortingDevices.descDevicesCost());

		Arrays.sort(devs, SortingDevices.ascDevicesId()); 
		for(Devices temp : devs) {
			System.out.println(temp);
		}
		
	}
}
