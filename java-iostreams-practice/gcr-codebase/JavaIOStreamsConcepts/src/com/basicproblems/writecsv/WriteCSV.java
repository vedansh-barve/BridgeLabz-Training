package com.basicproblems.writecsv;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "employees.csv";
		
		try (FileWriter writer = new FileWriter(fileName)) {

            // Writing header
            writer.append("ID,Name,Department,Salary\n");

            // Writing employee records
            writer.append("1,Rahul,IT,50000\n");
            writer.append("2,Anita,HR,45000\n");
            writer.append("3,Suresh,Finance,55000\n");
            writer.append("4,Priya,Marketing,48000\n");
            writer.append("5,Amit,Operations,52000\n");

            System.out.println("CSV file created and data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
