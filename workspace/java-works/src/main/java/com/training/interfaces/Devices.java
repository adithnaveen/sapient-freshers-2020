package com.training.interfaces;

public class Devices implements Comparable<Devices> {
	private int dId;
	private String dName; 
	private double cost;
	
	public Devices() {}
	
	public Devices(int dId, String dName, double cost) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.cost = cost;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Devices [dId=" + dId + ", dName=" + dName + ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(Devices o) {
//		return this.dId - o.getdId();
		return this.dName.compareTo(o.getdName()); 
	}
 
	
}
