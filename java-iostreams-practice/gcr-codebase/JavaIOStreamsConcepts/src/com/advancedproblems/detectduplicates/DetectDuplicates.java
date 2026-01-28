package com.advancedproblems.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "students.csv";
        String line;
        String splitBy = ",";

        Set<String> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                String id = data[0];

                // If ID already exists, it's a duplicate
                if (!seenIds.add(id)) {
                    System.out.println("Duplicate Record Found:");
                    System.out.println("ID    : " + data[0]);
                    System.out.println("Name  : " + data[1]);
                    System.out.println("Age   : " + data[2]);
                    System.out.println("Marks : " + data[3]);
                    System.out.println("----------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
