package com.day9.medwarehouse;
import java.time.LocalDateTime;

public class Medicine {

	String mediId;
	LocalDateTime expiry;
	
	public Medicine(String mediId, String time) {
		this.mediId = mediId;
		this.expiry = LocalDateTime.parse(time);
	}
}
