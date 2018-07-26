package com.twentysixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("input name: ");
	System.out.println(br.readLine());
	System.out.println("===========");
	
	System.out.println("Enter your age:");
	String x=br.readLine();
	System.out.println("Age is :" +x);
}
}
