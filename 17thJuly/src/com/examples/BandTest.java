package com.examples;

public class BandTest {

	public static void main(String[] args) {
		
		Band b1=new Band();
		String arr[]={"Arvind","Anfal"};
		
		b1.setBandDetails("Deloitte", arr, new String[] {"Viraaj","Kiran"}, "Jason", "Rohan");
		b1.printBandDetails();   
	}

}
