package com.twentyfifth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Jason");
		hm.put(2, "Kiran");
		hm.put(3, "Akarsh");
		hm.put(4, "Peter");
		
		System.out.println(hm.values());
		
		Set keys = hm.keySet();
		Iterator it = keys.iterator();
		
		
		
	}

}
