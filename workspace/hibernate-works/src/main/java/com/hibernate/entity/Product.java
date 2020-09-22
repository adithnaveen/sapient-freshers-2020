package com.hibernate.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// 1. Single Table (This is by default if you dont specify anything) 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PRODUCT_TYPE", 
	discriminatorType=DiscriminatorType.STRING)


// 2. Table per class 
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

// 3. Joined O(this is called normalized strategy)
//@Inheritance(strategy=InheritanceType.JOINED)





@Entity

public class Product {
	@Id
	private int pId; 
	private String pName; 
	private String pDesc; 
	private double pPrice;
	public Product() {}
	public Product(int pId, String pName, String pDesc, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", pPrice=" + pPrice + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	} 
	
}