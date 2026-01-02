package com.bridgelabz.oops.encapsulation.employeemanagement;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
	     e1.assignDepartment("IT");

	     Employee e2 = new PartTimeEmployee(102, "Anita", 80, 300);
	     e2.assignDepartment("HR");
	     
	     e1.displayDetails();
	     System.out.println();
	     
	     e2.displayDetails();
	}

}
