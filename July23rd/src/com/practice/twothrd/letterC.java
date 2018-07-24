package com.practice.twothrd;

public class letterC {

	public static void main(String[] args) {

		String s = null;
		
		for (int i = 0; i < args.length; i++) {
			s+=args[i];
		}
		
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C' || s.charAt(i) == 'c')
				count++;
		}

		System.out.println("C is repeated " + count + " times");
	}

}
