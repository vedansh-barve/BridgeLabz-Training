package com.day7.skillforge;

public class Instructor extends User {
	public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(String courseTitle) {
        System.out.println("Instructor " + name + " uploaded course: " + courseTitle);
    }
}
