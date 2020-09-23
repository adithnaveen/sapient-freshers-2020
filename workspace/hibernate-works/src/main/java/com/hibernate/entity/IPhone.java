package com.hibernate.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class IPhone extends CellPhone {
	private String availableCountry;

	public IPhone(int pId, String pName, String pDesc, double pPrice, String type, String os, String connectivity,
			String availableCountry) {
		super(pId, pName, pDesc, pPrice, type, os, connectivity);
		this.availableCountry = availableCountry;
	}

}
