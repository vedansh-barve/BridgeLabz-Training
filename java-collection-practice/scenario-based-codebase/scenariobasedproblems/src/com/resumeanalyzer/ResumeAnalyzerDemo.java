package com.resumeanalyzer;

public class ResumeAnalyzerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResumeAnalyzer analyzer = new ResumeAnalyzer();

        String folder = "samplefiles";

        analyzer.processFolder(folder);
        analyzer.showResults();
        System.out.println("--------------------------------------------------");
	}

}
