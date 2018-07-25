package com.twentyfifth;

import java.util.ArrayList;
import java.util.Collections;

class Car1 {
	String color, brand;
	double price;

	/**
	 * @param color
	 * @param brand
	 * @param price
	 */
	public Car1(String color, String brand, double price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.color + "," + this.brand + "," + this.price;
	}
	
	public int compare(Object obj) {
		Car1 cc = (Car1)obj;
		int retValue=0;
		
		if(this.price==cc.price)
			retValue=0;
		else if(this.price<cc.price)
			retValue=-1;
		else if(this.price>cc.price)
			retValue=1;
		
		return retValue;		
	}

}

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();

		Car1 c1 = new Car1("White", "Audi", 15000);
		Car1 c2 = new Car1("Red", "Ferrari", 20000);
		Car1 c3 = new Car1("Green", "Chevrolet", 12000);

		a1.add(c1);
		a1.add(c2);
		a1.add(c3);

		System.out.println(a1);
		
		Collections.sort(a1);
		
		System.out.println(a1);
	}

}
