package com.training.ds.adt;

public class Average<T extends Number> {
	
	// T reference of Array of type 
	T nums[];

	public Average(T[] nums) {
		super();
		this.nums = nums;
	} 
	
	double average() {
		double sum = 0;  // 0.0 
		
		for(int i=0; i<nums.length; i++) {
			sum = sum + nums[i].doubleValue(); 
		}
		return sum / nums.length; 
	}
}
