package com.twentyfifth;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(15);
		a1.add(5);
		a1.add(18);
		a1.add(12);
		a1.add(2);
		a1.add(56);
		
		
		ArrayList a2 = new ArrayList();
		
		//a2.addAll(a1);
		
		
		
		Collections.copy(a2, a1);
		
		Collections.sort(a1);
		
		System.out.println("SORTED:"+a1);
		System.out.println("UNSORTED:"+a2);
		
		System.out.println(Collections.binarySearch(a1, 18));
		
		
	}
	
}
