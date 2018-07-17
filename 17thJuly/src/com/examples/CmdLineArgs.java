package com.examples;

public class CmdLineArgs {

	public static void main(String[] args) {

		System.out.println("YOu passed " + args.length + " number of arguments.");

		for (String string : args) {
			System.out.println(string);
		}

	}

}
