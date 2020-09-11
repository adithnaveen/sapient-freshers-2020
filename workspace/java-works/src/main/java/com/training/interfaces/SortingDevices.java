package com.training.interfaces;

import java.util.Comparator;

public class SortingDevices {

	public static Comparator<Devices> ascDevicesCost() {
		return new Comparator<Devices>() {

			@Override
			public int compare(Devices o1, Devices o2) {
				return (int) (o1.getCost() - o2.getCost());
			}
		};
	}

	public static Comparator<Devices> descDevicesCost() {
		return new Comparator<Devices>() {

			@Override
			public int compare(Devices o1, Devices o2) {
				return (int) (o2.getCost() - o1.getCost());
			}
		};
	}

	public static Comparator<Devices> ascDevicesId(){
		return  ( o1,  o2) ->  o1.getdId() - o2.getdId();  
	}
}
