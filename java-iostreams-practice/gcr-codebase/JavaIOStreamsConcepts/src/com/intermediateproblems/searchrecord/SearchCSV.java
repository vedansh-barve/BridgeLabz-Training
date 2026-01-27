package com.intermediateproblems.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String fileName = "employees.csv";
		 String line;
		 String splitBy = ",";
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter employee name to search: ");
		 String searchName = scanner.nextLine();

		 boolean found = false;
		 
		 try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

	            // Skip header
	            br.readLine();

	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(splitBy);

	                if (data[1].equalsIgnoreCase(searchName)) {
	                    System.out.println("\nEmployee Found!");
	                    System.out.println("Department : " + data[2]);
	                    System.out.println("Salary     : " + data[3]);
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                System.out.println("\nEmployee not found.");
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        scanner.close();
	}

}
