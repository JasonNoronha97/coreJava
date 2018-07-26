package com.twentysixth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("src/com/twentysixth/divby3.java");

		int xx = fs.read();
		while (xx != -1) {
			System.out.print((char) xx);
			xx = fs.read();
		}
		fs.close();

		FileReader fr = new FileReader("src/com/twentysixth/divby3.java");

		BufferedReader br = new BufferedReader(fr);

		String rea = br.readLine();
		while (rea != null) {
			System.out.println(rea);
			rea = br.readLine();
		}
		
		fr.close();
	}

}
