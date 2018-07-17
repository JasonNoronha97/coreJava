package com.examples;

public class BasketOfBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bask1[] = { "Red", "Green", "Blue", "Green", "Blue", "Red", "Green" };
		String bask2[] = { "Red", "Green", "Blue", "Green", "Blue", "Red", "Green", "Red" };
		int count = 0;

		for (int i = 0; i < bask1.length; i++) {
			if ("Red" == bask1[i]) {
				count++;
			}
		}

		for (int i = 0; i < bask2.length; i++) {
			if ("Red" == bask2[i]) {
				count++;
			}
		}
		System.out.println("Red exists " + count + " times.");
	}
}
