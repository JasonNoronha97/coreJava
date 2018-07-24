package com.practice.twothrd;

public class CharacterRead {

	public static void main(String[] args) {
		String s = "Deloitte 123 works for 9 hours.*&*";

		char arr[] = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char x = arr[i];
			if (Character.isDigit(x))
				System.out.println(x + " is a digit");
			else if (Character.isLetter(x))
				System.out.println(x + " is a letter");
			else if (Character.isWhitespace(x))
				System.out.println(x + " is a blank");
			else
				System.out.println(x + " is a special char");
		}
		
		System.out.println(s);
	}

}
