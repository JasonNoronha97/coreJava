package com.twentysixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divby3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name, city;
		System.out.println("Enter NAME:");
		name = br.readLine();
		System.out.println("Enter CITY:");
		city = br.readLine();

		System.out.println("Welcome " + name + ",\nYou are living in " + city + ".");

		System.out.println("Enter a no: ");
		int xx=Integer.parseInt(br.readLine());
		if(xx%3==0)
			System.out.println("Divisible by 3");
		else
			System.out.println("Not div by 3");
		
		System.out.println("Enter 5 numbers");
		int sum=0;
		int x[]=new int[5];
		try {
			for (int i = 0; i < 5; i++) {
				x[i]=Integer.parseInt(br.readLine());
				sum+=x[i];
			}
		} catch (NumberFormatException nf) {
			System.out.println("Enter a proper number.");
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average ="+sum/5);
		
		int max=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]>max)
				max=x[i];
		}
		System.out.println("Max is:"+max);
	}

}
