package com.training.collections;

public class Stationary implements Comparable<Stationary> {
	private String name;
	private double price;

	public Stationary() {
	}

	public Stationary(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stationary [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return this.name.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		Stationary temp = (Stationary) obj;
		return this.name.equals(temp.getName()) && this.price == temp.price;

	}

	@Override
	public int compareTo(Stationary o) {
		return (int) (this.price - o.getPrice());
	}

}
