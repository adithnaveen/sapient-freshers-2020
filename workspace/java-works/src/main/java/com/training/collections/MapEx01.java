package com.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(); 
		map.put("Karnataka", "Bengaluru"); 
		map.put("TamilNadu", "Chennai"); 
		map.put("Telangana", "Hyndrabad");
		
		System.out.println(map.get("Karnataka"));

		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next.getKey() +", " + next.getValue());
		}
	}
}
