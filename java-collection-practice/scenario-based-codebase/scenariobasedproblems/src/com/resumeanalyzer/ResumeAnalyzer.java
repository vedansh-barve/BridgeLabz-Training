package com.resumeanalyzer;
import java.util.*;
import java.io.*;
import java.util.regex.*;

public class ResumeAnalyzer {

//	<Email, candidateData>
	private Map<String, ResumeData> candidates;
	
//	sorted List
	private List<ResumeData> sortedList;
	
	public ResumeAnalyzer() {
		candidates = new HashMap<>();
		sortedList = new ArrayList<>();
	}
	
	public void processFolder(String folderPath) {
		File folder = new File(folderPath);
		File[] files = folder.listFiles();
		
		if(files == null) {
			System.out.println("Folder is Empty..");
			return;
		}
		
		for(File file: files) {
			if(!file.isFile() || !file.getName().toLowerCase().endsWith(".txt")) {
				continue;
			}
			
			try {
				String text = readFile(file);
				String email = findEmail(text);
				
				if(email == null) {
					throw new InvalidFormatException("Email Not Found");
				}
				
				String phone = findPhone(text);
				int count = countSkills(text);
				
				ResumeData candidate = new ResumeData(email, phone, count, file.getName());
				// <K, V> Key is Email
				candidates.put(email, candidate);
			}
			catch(Exception e) {
				System.out.println("Skipped: " + file.getName() + " -> " + e.getMessage());
			}
		}
		
		sortedList.addAll(candidates.values());
		sortedList.sort((a, b) -> b.getMatchCount() - a.getMatchCount());
	}
	
	private String readFile(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
		}
		return sb.toString(); 
	}
	
	private String findEmail(String text) {
		Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		Matcher m = p.matcher(text);
		return m.find() ? m.group() : null;
	}
	
	private String findPhone(String text) {
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(text);
		return m.find() ? m.group() : "Not Found";
	}
	
	private int countSkills(String text) {
		Pattern p = Pattern.compile("[\\b(java|python|spring)\\b]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		int count = 0;
		while(m.find()) {
			count++;
		}
		return count;
	}
	
	public void showResults() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Email                 | Phone             |Matches      |File name         |");
		System.out.println("----------------------------------------------------------------------------");

		for (ResumeData d : sortedList) {
			System.out.println(d);
		}

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total valid resumes: " + sortedList.size());
	}
}
