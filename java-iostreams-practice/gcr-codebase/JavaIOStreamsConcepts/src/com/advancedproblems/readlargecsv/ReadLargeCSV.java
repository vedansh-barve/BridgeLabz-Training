package com.advancedproblems.readlargecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSV {

	private static final int CHUNK_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "large_file.csv";
        String line;
        int totalRecords = 0;

        List<String> buffer = new ArrayList<>(CHUNK_SIZE);
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header (optional)
            br.readLine();

            while ((line = br.readLine()) != null) {

                buffer.add(line);

                // When buffer reaches chunk size
                if (buffer.size() == CHUNK_SIZE) {
                    processChunk(buffer);
                    totalRecords += buffer.size();
                    buffer.clear();

                    System.out.println("Records processed so far: " + totalRecords);
                }
            }

            // Process remaining lines
            if (!buffer.isEmpty()) {
                processChunk(buffer);
                totalRecords += buffer.size();
                System.out.println("Records processed so far: " + totalRecords);
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	private static void processChunk(List<String> chunk) {
        // Example: parse, validate, store, etc.
        // For now, just simulate processing
        // No output here to keep it efficient
    }

}
