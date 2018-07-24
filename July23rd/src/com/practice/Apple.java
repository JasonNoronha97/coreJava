package com.practice;

public class Apple {
	String appleName;
	double price;

	
	
	/**
	 * @param appleName
	 * @param price
	 */
	public Apple(String appleName, double price) {
		super();
		this.appleName = appleName;
		this.price = price;
	}

	public void whichIsGreater(Object o1, Object o2) {
		Apple a1 = (Apple) o1;
		Apple a2 = (Apple) o2;

		if (a1.price > a2.price) {
			System.out.println(a1.appleName + " is greater.");
		} else {
			System.out.println(a2.appleName + "is greater.");
		}
	}
}
