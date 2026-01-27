package com.annotations.bugreport;

public class SampleService {

	@BugReport(description = "NullPointerException in edge case")
    @BugReport(description = "Performance issue for large input")
    public void processData() {
        System.out.println("Processing data...");
    }
}
