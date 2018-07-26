
package com.twentysixth;

import java.io.*;

public class WriteFileDemo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/sample.txt");

		String s = "Hello World";
		char a[] = new char[s.length()];
		
		a=s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			fos.write(a[i]);
		}
		
		fos.write('\n');
		fos.write('h');
		fos.close();
		
		FileWriter fw = new FileWriter("D:/sample1.txt");
		fw.write(s+"   HALLOOOOO");
		fw.close();
		
		
		
	}

}
