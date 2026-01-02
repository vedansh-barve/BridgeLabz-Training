package com.hospitalmanagementsystem;

public class OutPatient extends Patient{
	
	private double consultationFee;
	
	public OutPatient(int id, String name, int age, double consultationFee) {
		super(id, name, age);
		this.consultationFee = consultationFee;
	}
	
	public double getTreatmentCost() {
		return consultationFee;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Patient Type: OutPatient");
		System.out.println(getSummary());
		System.out.println("Consultation Fee: " + consultationFee);
	}
}
