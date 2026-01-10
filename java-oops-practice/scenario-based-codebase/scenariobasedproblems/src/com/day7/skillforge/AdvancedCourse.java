package com.day7.skillforge;
import java.util.*;

public class AdvancedCourse extends Course implements ICertifiable {
	public AdvancedCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Advanced Level Certificate Issued");
    }
}
