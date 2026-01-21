package com.collections.wordfrequency;

import java.util.*;

public class WordFrequency {

	public static void findFrequency(String text) {
		
		text = text.toLowerCase();
		text = text.replaceAll("[^a-z ]", "");
		
		String[] words = text.split("\\s+");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word: words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		
		String text = "Hello world, hello java";
		findFrequency(text);
	}
}
