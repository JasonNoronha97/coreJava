package com.practice.twothrd;

public class UserNamePassword {

	public static void main(String[] args) {
		String username=args[0];
		String password= args[1];
		
		if(username.equals("Jason") && password.equals("Deloitte"))
			System.out.println("You are a valid user.");
		else
			System.out.println("You are an invalid user.");

	}

}
