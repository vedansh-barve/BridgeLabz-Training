package com.intermediateproblems.modifycsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";
        String line;
        String splitBy = ",";
        
        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                FileWriter writer = new FileWriter(outputFile)
            ) {

                // Read and write header
                writer.write(br.readLine() + "\n");

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(splitBy);

                    String department = data[2];
                    double salary = Double.parseDouble(data[3]);

                    // Increase salary by 10% for IT department
                    if (department.equalsIgnoreCase("IT")) {
                        salary = salary + (salary * 0.10);
                    }

                    // Write updated record
                    writer.write(data[0] + "," + data[1] + "," + data[2] + "," + (int) salary + "\n");
                }

                System.out.println("Updated CSV file created successfully.");

            } catch (IOException e) {
                e.printStackTrace();
            }
	}

}
