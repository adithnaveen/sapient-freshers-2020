package com.hibernate.entity;

import javax.persistence.Entity;

@Entity

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

	public Television() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Television [size=" + size + ", screenType=" + screenType + ", resolution=" + resolution + "]";
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}