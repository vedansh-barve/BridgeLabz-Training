package com.day7.skillforge;

public class Student extends User implements ICertifiable{
	 private int progress; // percentage

	    public Student(String name, String email) {
	        super(name, email);
	        this.progress = 0;
	    }

	    // Operator usage for progress tracking
	    public void updateProgress(int value) {
	        progress += value;
	        if (progress > 100)
	            progress = 100;
	    }

	    public int getProgress() {
	        return progress;
	    }

	    // Polymorphism: certificate varies per course level
	    @Override
	    public void generateCertificate() {
	        if (progress == 100)
	            System.out.println("Certificate Generated for Student: " + name);
	        else
	            System.out.println("Course not completed yet");
	    }
}
