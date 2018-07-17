package com.examples;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee E = new Employee(12,"Jason",4999.0);
			Employee e = new Employee();
			System.out.println(Employee.getCompanyName());
			System.out.println("E.calcBonus() : "+E.calcBonus());
			System.out.println("e.calcBonus(): "+e.calcBonus());
	}

}
