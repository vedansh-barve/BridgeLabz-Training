package com.day1.feedbackguru;

public class FeedbackGuruDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FeedBackAnalyzer<String> guru = new FeedBackAnalyzer<>();

		// folder path
		String feedbackFolder = "samplefiles/feedbackfiles";

		System.out.println("Analyzing feedback files...\n");
		guru.analyzeFolder(feedbackFolder);

		guru.printSummary();

		System.out.println("Total feedback entries processed: " + guru.getTotalFeedback());
	}

}
