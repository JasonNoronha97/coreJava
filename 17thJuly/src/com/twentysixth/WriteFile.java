package com.twentysixth;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// input city names till her/she says STOP & count of cities
		int count = 0;
		String s = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("D:\\sample3.txt");
		
		System.out.println("Enter City names (STOP to stop): ");
		s = br.readLine();

		while (!s.equalsIgnoreCase("stop")) {
			fw.write(s+"\n");
			count++;
			s = br.readLine();
		}
		fw.close();
		System.out.println(count);
	}

}
