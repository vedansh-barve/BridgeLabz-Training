package com.javastreams.filereadwrite;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = null;
        
        try {
            // Reading user input
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Writing to file
            fw = new FileWriter("user_info.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Programming Language: " + language + "\n");

            System.out.println("User information saved successfully.");

        }
        catch (IOException e) {
            System.out.println("An error occurred while reading or writing data.");
            e.printStackTrace();

        } 
        finally {
            try {
                if (fw != null)
                    fw.close();
                br.close();
            } catch (IOException e) {
                System.out.println("Error closing resources.");
            }
        }

	}

}
