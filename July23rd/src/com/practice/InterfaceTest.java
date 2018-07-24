package com.practice;


public class InterfaceTest {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Jason", 12000);
		Employee1 e2 = new Employee1("Kiran",10000);
		
		Employee1 e3 = new Employee1(null, 0);
		e3.whichIsGreater(e1, e2);
		
		Apple a1 = new Apple("Kasmiri", 56);
		Apple a2 = new Apple("Local", 40);
		Apple a3 = new Apple(null,0);
		a3.whichIsGreater(a1, a2);
	}
}
