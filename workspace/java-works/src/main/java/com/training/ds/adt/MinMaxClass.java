package com.training.ds.adt;

// int with int 
// float with float 
// double with double 
// char with char 
// string with string 

public class MinMaxClass<T extends Comparable<T>> 
	implements MinMax<T> {

	T arrs[];

	public MinMaxClass(T[] arrs) {
		super();
		this.arrs = arrs;
	}

	@Override
	public T min() {
		T temp = arrs[0];

		for (int i = 1; i < arrs.length; i++) {
			if (arrs[i].compareTo(temp) < 0) {
				temp = arrs[i];
			}
		}
		return temp;
	}

	@Override
	public T max() {
		T temp = arrs[0];

		for (int i = 1; i < arrs.length; i++) {
			if (arrs[i].compareTo(temp) > 0) {
				temp = arrs[i];
			}
		}
		return temp;
	}
}
