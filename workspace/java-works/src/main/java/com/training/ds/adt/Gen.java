package com.training.ds.adt;

public class Gen<T> {
	T obj; 
	
	public Gen(T obj) {
		this.obj =obj; 
	}

	public T getObj() {
		return obj;
	}
	
	public void showType() {
		System.out.println("Type of T is :" +
				obj.getClass().getName());
	}
	
	
}
