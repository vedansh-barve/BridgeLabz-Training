package com.basicproblems.countrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "employees.csv";
        int count = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header row
            br.readLine();

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Number of records (excluding header): " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
