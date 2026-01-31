package com.day1.travelLog;

public class InvalidTripException extends Exception{

	private static final long serialVersionUID = 1L;
	public InvalidTripException(String msg) {
		super(msg);
	}
}
