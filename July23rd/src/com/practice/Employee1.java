package com.practice;

public class Employee1 implements InterfaceName {
	String eName;
	double salary;

	/**
	 * @param eName
	 * @param salary
	 */
	public Employee1(String eName, double salary) {
		this.eName = eName;
		this.salary = salary;
	}

	public void whichIsGreater(Object o1, Object o2) {
		Employee1 e1 = (Employee1) o1;
		Employee1 e2 = (Employee1) o2;

		if (e1.salary > e2.salary) {
			System.out.println(e1.eName + " is greater.");
		} else {
			System.out.println(e2.eName + "is greater.");
		}
	}
}
