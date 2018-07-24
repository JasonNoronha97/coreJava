package com.practice;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("DIVIDE ERROR. Cant divide a number by 0.");
		}
		System.out.println("END");
	}
}
