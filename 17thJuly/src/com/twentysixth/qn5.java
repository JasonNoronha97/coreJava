package com.twentysixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class qn5 {

	public static void main(String[] args) throws IOException {
		//input city names till her/she says STOP & count of cities
		int count=0;
		String s=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter City names (STOP to stop): ");
		s=br.readLine();
		while(!s.equalsIgnoreCase("stop"))
		{
			count++;
			s=br.readLine();
		}
		System.out.println(count);
	}

}
