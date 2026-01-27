package com.reflection.executiontime;

public class SampleService {
	public void slowTask() {
		for (int i = 0; i < 40_000_000; i++) {
		}
		System.out.println("Slow task completed.");
	}
}
