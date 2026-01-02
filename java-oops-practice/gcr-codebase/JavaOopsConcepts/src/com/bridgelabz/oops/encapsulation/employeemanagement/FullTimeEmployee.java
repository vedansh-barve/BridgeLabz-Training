package com.bridgelabz.oops.encapsulation.employeemanagement;

public class FullTimeEmployee extends Employee{
	
	public FullTimeEmployee(int empId, String name, double fixedSalary) {
		super(empId, name, fixedSalary);
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary();
	}
}
