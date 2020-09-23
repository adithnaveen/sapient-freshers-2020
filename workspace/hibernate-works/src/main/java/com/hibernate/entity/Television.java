package com.hibernate.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Television extends Product {
	private int size;
	private String screenType; // LCD, LED, CRT
	private String resolution; // 1024 x 776

	public Television(int pId, String pName, String pDesc, double pPrice, int size, String screenType,
			String resolution) {
		super(pId, pName, pDesc, pPrice);
		this.size = size;
		this.screenType = screenType;
		this.resolution = resolution;
	}

	
	
}