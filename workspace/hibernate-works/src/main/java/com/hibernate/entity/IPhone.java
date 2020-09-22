package com.hibernate.entity;

import javax.persistence.Entity;

@Entity
public class IPhone extends CellPhone {
	private String availableCountry;

	public IPhone(int pId, String pName, String pDesc, double pPrice, String type, String os, String connectivity,
			String availableCountry) {
		super(pId, pName, pDesc, pPrice, type, os, connectivity);
		this.availableCountry = availableCountry;
	} 
	public IPhone() {}
	public String getAvailableCountry() {
		return availableCountry;
	}
	public void setAvailableCountry(String availableCountry) {
		this.availableCountry = availableCountry;
	}
	@Override
	public String toString() {
		return "IPhone [availableCountry=" + availableCountry + "]";
	}
	
	
	
	
}
