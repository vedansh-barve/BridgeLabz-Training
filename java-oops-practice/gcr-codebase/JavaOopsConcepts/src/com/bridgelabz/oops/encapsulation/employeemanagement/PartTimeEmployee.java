package com.bridgelabz.oops.encapsulation.employeemanagement;

public class PartTimeEmployee extends Employee{
	private int workHours;
	private double hourlyRate;
	
	public PartTimeEmployee(int empId, String name, int workHours, double hourlyRate) {
		super(empId, name, 0);
		this.workHours = workHours;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return (workHours * hourlyRate);
	}
}
