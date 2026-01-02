package com.hospitalmanagementsystem;

public class InPatient extends Patient{
	
	private int daysAdmitted;
	private double dailyCharge;
	
	public InPatient(int id, String name, int age, int daysAdmitted, double dailyCharge) {
		super(id, name, age);
		this.daysAdmitted = daysAdmitted;
		this.dailyCharge = dailyCharge;
	}
	
	public double getTreatmentCost() {
		return (daysAdmitted * dailyCharge);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Patient Type : InPatient");
		System.out.println(getSummary());
		System.out.println("Days Admitted: " + daysAdmitted);
	}
}
