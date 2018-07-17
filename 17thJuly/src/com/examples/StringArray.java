package com.examples;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Jason", "Sanjana", "Priya", "Anfal", "Arvind" };
		String search = "Anfal";
		
		for (int i = 0; i < names.length; i++) {
			if (search == names[i]) {
				System.out.println(search + " is at position " + i);
				break;
			}
		}
	}
}
