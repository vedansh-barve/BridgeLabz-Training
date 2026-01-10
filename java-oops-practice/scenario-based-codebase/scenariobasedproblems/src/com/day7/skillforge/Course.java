package com.day7.skillforge;
import java.util.*;

public class Course {
	 private String title;
	    private Instructor instructor;
	    private List<String> modules;
	    protected double rating; 

	    private final List<String> reviews; 

	    public Course(String title, Instructor instructor) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = new ArrayList<>();
	        this.reviews = new ArrayList<>();
	        this.rating = 0.0;
	    }

	    public Course(String title, Instructor instructor, List<String> modules) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = modules;
	        this.reviews = new ArrayList<>();
	        this.rating = 0.0;
	    }

	    protected void updateRating(double newRating) {
	        rating = (rating + newRating) / 2;
	    }

	    public double getRating() {
	        return rating;
	    }

	    public List<String> getReviews() {
	        return Collections.unmodifiableList(reviews);
	    }

	    public void addReview(String review, double newRating) {
	        reviews.add(review);
	        updateRating(newRating);
	    }

	    public void showCourseDetails() {
	        System.out.println("Course: " + title);
	        System.out.println("Instructor: " + instructor.name);
	        System.out.println("Rating: " + rating);
	        System.out.println("Modules: " + modules);
	    }
}
