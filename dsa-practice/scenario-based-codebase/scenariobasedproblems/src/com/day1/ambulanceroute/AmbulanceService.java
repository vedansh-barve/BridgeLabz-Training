package com.day1.ambulanceroute;

public class AmbulanceService {
	
	public void routePatient(HospitalUnit start) {
		if (start == null) {
			System.out.println("No hospital units available.");
			return;
		}

		HospitalUnit temp = start;

		do {
			if (temp.available) {
				System.out.println("Patient sent to: " + temp.name);
				return;
			}
			temp = temp.next;
		} while (temp != start);

		System.out.println("No available unit found.");
	}
}
