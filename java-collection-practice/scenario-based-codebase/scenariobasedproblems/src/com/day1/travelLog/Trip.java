package com.day1.travelLog;
import java.io.Serializable;

public class Trip implements Serializable {

	String city;
	String country;
	int durationDays;
	String notes;
	
	public Trip(String city, String country, int durationDays, String notes) {
		this.city = city;
		this.country = country;
		this.durationDays = durationDays;
		this.notes = notes;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getDurationDays() {
		return durationDays;
	}
	
	public String getNotes() {
		return notes;
	}
	
	@Override
	public String toString() {
		return city + " | " + country + " | " + durationDays + " | " + notes;
	}
}
