package com.generics.aiscreeningsystem;
import java.util.List;

public class ResumeScreeningUtils {

	public static void screenResumes(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            System.out.println("Screening resume for: " + candidate);
        }
    }

    public static <T extends JobRole> void scoreResume(Resume<T> resume) {
        double score = Math.random() * 100;
        System.out.println("Candidate: " + resume.getCandidate().getCandidateName()
                + " | Role: " + resume.getCandidate().getRoleName()
                + " | Score: " + String.format("%.2f", score));
    }
}
