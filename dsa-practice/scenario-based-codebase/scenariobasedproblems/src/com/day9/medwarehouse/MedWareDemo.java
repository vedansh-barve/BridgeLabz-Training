package com.day9.medwarehouse;

public class MedWareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medicine[] medicines = {new Medicine("M101", "2026-03-10T10:00"), new Medicine("M102", "2025-12-05T09:30"), new Medicine("M103", "2026-01-20T14:15"), new Medicine("M104", "2025-11-01T08:45")};
		MergeSort.mergeSort(medicines, 0, medicines.length-1);
		
		for (Medicine medicine : medicines) {
            System.out.println(medicine.mediId + " - " + medicine.expiry);
        }
	}

}
