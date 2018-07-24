package com.practice.twothrd;

public class palindrome {

	public static void main(String[] args) {
		StringBuffer myname = new StringBuffer("Jason Emmanuel Noronha");
		//System.out.println(myname.reverse());
		
		for (int i = myname.length()-1; i >= 0 ; i--) {
			System.out.print(myname.charAt(i));
		}
	}

}
