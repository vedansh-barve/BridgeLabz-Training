package com.advancedproblems.mergetwocsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";

        Map<String, String[]> studentMap = new HashMap<>();

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                FileWriter writer = new FileWriter(outputFile)
            ) {

                // Skip headers
                br1.readLine();
                br2.readLine();

                // Read students1.csv (ID, Name, Age)
                String line;
                while ((line = br1.readLine()) != null) {
                    String[] data = line.split(",");
                    studentMap.put(data[0], new String[]{data[1], data[2]});
                }

                // Write header to output file
                writer.write("ID,Name,Age,Marks,Grade\n");

                // Read students2.csv (ID, Marks, Grade) and merge
                while ((line = br2.readLine()) != null) {
                    String[] data = line.split(",");

                    String id = data[0];
                    String marks = data[1];
                    String grade = data[2];

                    if (studentMap.containsKey(id)) {
                        String[] studentInfo = studentMap.get(id);

                        writer.write(
                                id + "," +
                                studentInfo[0] + "," +
                                studentInfo[1] + "," +
                                marks + "," +
                                grade + "\n"
                        );
                    }
                }

                System.out.println("CSV files merged successfully.");

            } catch (IOException e) {
                e.printStackTrace();
            }
	}

}
