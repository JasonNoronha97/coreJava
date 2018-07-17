package com.examples;

public class Car {
	String carName;
	double mileage, price;
	boolean luxuryType;
	/**
	 * @param carName
	 * @param mileage
	 * @param price
	 * @param luxuryType
	 */
	public void setCarDetails(String carName, double mileage, double price, boolean luxuryType) {
		this.carName = carName;
		this.mileage = mileage;
		this.price = price;
		this.luxuryType = luxuryType;
	}

	
	public void printCarDetails() {
		System.out.println("Car [carName=" + carName + ", mileage=" + mileage + ", price=" + price + ", luxuryType=" + luxuryType
				+ "]");
	}
}