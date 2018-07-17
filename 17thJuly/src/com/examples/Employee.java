package com.examples;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	private static String companyName = "Deloitte";

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		//super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	public Employee() {
		this.employeeId=1;
		this.employeeName="Jayyyyyy";
		this.employeeSalary=12000.5;
	}



	public int getEmployeeId() {
		return employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}

	
	public static String getCompanyName() {
		return companyName;
	}

	public double calcBonus()
	{
		double bonus=0.0;
		if (this.employeeSalary<=5000)
			bonus=employeeSalary*0.2;
		else
			bonus=employeeSalary*0.1;
		return bonus;
	}
}
