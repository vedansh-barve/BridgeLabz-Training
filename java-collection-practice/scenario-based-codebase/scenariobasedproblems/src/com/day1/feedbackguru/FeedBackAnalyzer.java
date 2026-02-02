package com.day1.feedbackguru;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class FeedBackAnalyzer<T> {

	Map<FeedbackCategory, List<String>> catergoryFeedback;
	
	public FeedBackAnalyzer(){
		catergoryFeedback = new HashMap<>();
		for(FeedbackCategory f: FeedbackCategory.values()) {
			catergoryFeedback.put(f, new ArrayList<>());
		}
	}
	
	public void analyzeFolder(String folderPath) {
		File folder = new File(folderPath);
		File[] files = folder.listFiles();
		
		if(files == null || files.length == 0) {
			System.out.println("No files found...");
			return;
		}
		
		for(File file: files) {
			if(file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
				readFeedBack(file);
			}
		}
	}
	
	public void readFeedBack(File file) {
		try(BufferedReader sb = new BufferedReader(new FileReader(file))){
			String line;
			while((line = sb.readLine()) != null) {
				line = line.trim();
				if(line.isEmpty())
					continue;
				
				processLine(line);
			}
		}
		catch(IOException e) {
			System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
		}
	}
	
	private void processLine(String line) {
		try {
			Integer rating = extractRating(line);
			
			if(rating == null) {
				addToCategory(FeedbackCategory.NEUTRAL, line);
				return;
			}
			
			FeedbackCategory category = getCategory(rating);
			addToCategory(category, line);
		}
		catch(Exception e) {
			System.out.println("Skipped invalid line: " + line);
		}
	}
	
	private Integer extractRating(String line) {
		Pattern p = Pattern.compile("\\\\b(\\\\d{1,2})/10\\\\b");
		Matcher m = p.matcher(line);
		
		if(m.find()) {
			try {
				int score = Integer.parseInt(m.group(1));
				if(score > 0 && score <= 10) {
					return score;
				}
			}
			catch(NumberFormatException e) {
				
			}
		}
		return null;
	}
	
	public void printSummary() {
    	System.out.println("--------------------------------------------------------------------------");
        System.out.println("Feedback Summary:");
        System.out.println("--------------------------------------------------------------------------");

        for (FeedbackCategory category : FeedbackCategory.values()) {
            List<String> list = categorizedFeedback.get(category);
            System.out.println(category + ": " + list.size() + " entries");

            // show first 3 examples (or all if less)
            int count = Math.min(3, list.size());
            for (int i = 0; i < count; i++) {
                System.out.println("  - " + list.get(i));
            }
            if (list.size() > 3) {
                System.out.println("  ... and " + (list.size() - 3) + " more");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------");
    }
}
