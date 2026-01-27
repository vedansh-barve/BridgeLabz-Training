package com.basicproblems.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line;
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {

            // Read header line and skip it
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] student = line.split(splitBy);

                System.out.println("Student Details");
                System.out.println("ID    : " + student[0]);
                System.out.println("Name  : " + student[1]);
                System.out.println("Age   : " + student[2]);
                System.out.println("Marks : " + student[3]);
                System.out.println("--------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
