package com.javastreams.filereadwrite;
import java.io.*;

public class FilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(sourceFile));
            bw = new BufferedWriter(new FileWriter(destinationFile));

            int ch;
            while ((ch = br.read()) != -1) {
                // Convert character to lowercase
                char lowerChar = Character.toLowerCase((char) ch);
                bw.write(lowerChar);
            }

            System.out.println("File converted from uppercase to lowercase successfully.");

        }
        catch (IOException e) {
            System.out.println("Error while reading or writing files.");
            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("Error closing streams.");
            }
        }
	}

}
