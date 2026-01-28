package com.advancedproblems.convertcsvtoobjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertCSVToObject {
	public static void main(String[] args) {

        String fileName = "students.csv";
        String line;
        String splitBy = ",";

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);

                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all Student objects
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
