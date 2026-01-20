package com.generics.aiscreeningsystem;
import java.util.Arrays;
import java.util.List;

public class ScreeningSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"));

        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));

        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie"));

        seResume.displayResume();
        dsResume.displayResume();
        pmResume.displayResume();

        System.out.println("\nScoring Resumes:");
        ResumeScreeningUtils.scoreResume(seResume);
        ResumeScreeningUtils.scoreResume(dsResume);
        ResumeScreeningUtils.scoreResume(pmResume);

        System.out.println("\nScreening Multiple Resumes:");
        List<JobRole> allCandidates = Arrays.asList(seResume.getCandidate(), dsResume.getCandidate(), pmResume.getCandidate()
        );
        ResumeScreeningUtils.screenResumes(allCandidates);
	}

}
