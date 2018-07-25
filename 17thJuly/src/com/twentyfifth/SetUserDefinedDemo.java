package com.twentyfifth;

import java.util.HashSet;

class MobilePhone {
	String mobileName;
	int price;

	/**
	 * @param mobileName
	 * @param price
	 */
	public MobilePhone(String mobileName, int price) {
		super();
		this.mobileName = mobileName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MobilePhone [mobileName=" + mobileName + ", price=" + price + "]";
	}

}

public class SetUserDefinedDemo {

	public static void main(String[] args) {
		MobilePhone m1 = new MobilePhone("Motorola", 11111);
		MobilePhone m2 = new MobilePhone("Motorola", 11111);

		HashSet hs = new HashSet();

		hs.add(m1);
		hs.add(m2);

		System.out.println(hs);
	}

}
