package com.javastreams.filereadwrite;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word,
                                wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        }
        catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // -------- Display Top 5 --------
        System.out.println("Top 5 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;
            if (count == 5)
                break;
        }

	}

}
