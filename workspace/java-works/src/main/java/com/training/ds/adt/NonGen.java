package com.training.ds.adt;

public class NonGen {
	Object obj; 
	
	public NonGen(Object obj) {
		this.obj = obj; 
	}

	public Object getObj() {
		return obj;
	}
	
	
	public void showType() {
		System.out.println("Type of Obj is : " + 
				obj.getClass().getName());
	}
}
