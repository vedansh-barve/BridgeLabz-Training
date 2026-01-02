package com.hospitalmanagementsystem;

public class Patient {
		
	private String name;
	private int age;
	private int patientId;
	private String medicalHistory;
	
	
	//normal patient
	public Patient(int patientId, String name, int age) {
		this.name = name;
		this.age = age;
		this.patientId = patientId; 
	}
	
	//emergency patient
	public Patient(int patientId, String name, int age, String medicalHistory) {
		this(patientId, name, age);
		this.medicalHistory = medicalHistory;
	}
	
	public String getSummary() {
		return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
	}
	
	public void displayInfo() {
		System.out.println("Patient Type: General");
		System.out.println(getSummary());
	}
	
}
