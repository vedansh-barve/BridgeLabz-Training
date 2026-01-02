package com.bridgelabz.oops.encapsulation.employeemanagement;

abstract class Employee implements Department{
	
	private int empId;
	private String name;
	private double baseSalary;
	private String department;
	
	public Employee(int empId, String name, double baseSalary) {
		this.empId = empId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return name;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double salary) {
		this.baseSalary = salary;
	}
	
	// Department interface method
	public void assignDepartment(String deptName) {
		this.department = deptName;
	}
	
	public String getDepartmentDetails() {
		return department;
	}
	
	// abstract method
	public abstract double calculateSalary();
	
	// concrete method
	public void displayDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + calculateSalary());
	}
	
	
}
