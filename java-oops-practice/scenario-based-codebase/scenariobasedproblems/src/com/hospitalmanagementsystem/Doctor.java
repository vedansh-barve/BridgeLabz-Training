package com.hospitalmanagementsystem;

public class Doctor {
	
	private String name;
	private int docId;
	private String specialist;
	
	public Doctor(String name, int docId, String specialist) {
		this.name = name;
		this.docId = docId;
		this.specialist = specialist;
	}
	
	public String getDoctorName() {
		return name;
	}
	
	public void displayInfo() {
		System.out.println("Doctor ID: " + docId);
		System.out.println("Doctor Name: " + name);
		System.out.println("Specialist: " + specialist);
	}
}
