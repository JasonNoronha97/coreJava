package com.practice.twothrd;

public class PasswordValidator {

	public static void main(String[] args) {
		// Password shud be min 5 characters
		// max 10 char

		// must contain @ least 1 uppercase, 1 digit, 1 spl symbol

		String password = "HeloWrl(*2";

		char x[] = password.toCharArray();
		int uppercase = 0, lowercase = 0, numbers = 0, specialCASE = 0;
		if (x.length < 5) {
			System.out.println("Too little characters.");
			return;
		}
		if (x.length > 10) {
			System.out.println("Too many characters.");
			return;

		}

		for (int i = 0; i < x.length; i++) {
			char ch = x[i];
			if (Character.isDigit(ch))
				numbers++;
			else if (Character.isUpperCase(ch))
				uppercase++;
			else if (Character.isLowerCase(ch))
				lowercase++;
			else if (Character.isWhitespace(ch)) {
				System.out.println("Password Contains white space");
				return;
			} else
				specialCASE++;
		}
		if (specialCASE == 0 || uppercase == 0 || lowercase == 0 || numbers == 0) {
			System.out.println("All conditions not met.");
		} else
			System.out.println("Valid Password.");
	}

}
