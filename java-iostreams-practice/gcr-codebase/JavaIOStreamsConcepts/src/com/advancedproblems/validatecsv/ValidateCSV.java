package com.advancedproblems.validatecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	    // Phone regex (exactly 10 digits)
	    private static final String PHONE_REGEX = "^[0-9]{10}$";
	    
	    String fileName = "users.csv";
        String line;
        String splitBy = ",";

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Invalid Email at ID " + id + ": " + email);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Invalid Phone Number at ID " + id + ": " + phone);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("❌ Invalid Row: " + line);
                    System.out.println("----------------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
