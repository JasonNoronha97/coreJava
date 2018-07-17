package com.examples;

public class CountryCapitalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries[] = { "India", "Pakistan", "Bangladesh", "USA" };
		String capitals[] = { "New Delhi", "Islamabad", "Dhaka", "Washington DC" };
		/*
		for (int i = 0; i < capitals.length; i++) {
			System.out.println("Capital of "+countries[i]+" is "+capitals[i]+".");
		}*/

		String searchC = "USA";
		
		for (int i = 0; i < countries.length; i++) {
			if(searchC==countries[i])
				System.out.println(capitals[i]);
		}
	}

}
