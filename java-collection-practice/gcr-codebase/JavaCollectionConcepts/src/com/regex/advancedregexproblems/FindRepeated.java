package com.regex.advancedregexproblems;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindRepeated {

	public static final String WORD_REGEX ="\\b(\\w+)\\s+\\1\\b";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="This is is a repeated repeated word test.";
		Pattern pattern = Pattern.compile(WORD_REGEX, Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.print(matcher.group(1)+", ");
		}
	}

}
