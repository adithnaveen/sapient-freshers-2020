package com.hibernate.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CellPhone extends Product {
	private String type; // smart phone or featured phone
	private String os; // iOS, Android, Windows
	private String connectivity; // GSM, CDMA
	public CellPhone(int pId, String pName, String pDesc, double pPrice, String type, String os, String connectivity) {
		super(pId, pName, pDesc, pPrice);
		this.type = type;
		this.os = os;
		this.connectivity = connectivity;
	}

	
	
}