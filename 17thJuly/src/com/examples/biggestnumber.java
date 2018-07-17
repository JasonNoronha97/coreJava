package com.examples;

import java.util.Random;

public class biggestnumber {
	public static void main(String args[]) {

		int arr[]=new int[7];	
		Random r1 = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r1.nextInt(100);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "    ");
		}
		System.out.println("\n--------------------");
		
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max is: "+max);
	}
}
