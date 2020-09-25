package com.training.springbootworks.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Address {
	private int houseNo;
	private String streetName;
	private String city;
	private String satte;
	private int zipcode;
	public Address(int houseNo, String streetName, String city, String satte, int zipcode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.satte = satte;
		this.zipcode = zipcode;
	}
}


