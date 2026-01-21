package com.collections.hospitaltraige;
import java.util.PriorityQueue;

public class Patient implements Comparable<Patient> {

	String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Higher severity = higher priority
    @Override
    public int compareTo(Patient other) {
        return other.severity - this.severity; // descending order
    }
}
