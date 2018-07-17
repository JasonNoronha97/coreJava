package com.examples;

import java.util.Random;

public class SumOfEven {
	public static void main(String args[]) {

		int arr[] = new int[6];
		int sum = 0;
		Random r1 = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r1.nextInt(100);
			if (arr[i] % 2 == 0)
				sum += arr[i];
			System.out.print(arr[i] + "    ");
		}
		
		System.out.println("\n--------------------");

		System.out.println("Sum=" + sum);
	}
}