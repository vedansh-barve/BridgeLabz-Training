package com.day7.skillforge;
import java.util.*;

public class SkillForgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor = new Instructor("Ravi Gautam", "ravi@gmail.com");

        List<String> modules = Arrays.asList("Java Basics", "OOP", "Collections");
        AdvancedCourse course = new AdvancedCourse("Java Mastery", instructor, modules);

        Student student = new Student("Vedansh", "vedansh@gmail.com");

        student.updateProgress(50);
        student.updateProgress(50); 

        course.addReview("Excellent course!", 4.5);
        course.showCourseDetails();

        student.generateCertificate();  
        course.generateCertificate();    
	}

}
