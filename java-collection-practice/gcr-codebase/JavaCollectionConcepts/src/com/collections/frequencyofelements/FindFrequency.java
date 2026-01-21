package com.collections.frequencyofelements;
import java.util.*;

public class FindFrequency {
	
	public static HashMap<String, Integer> findFrequency(List<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String l: list) {
			map.put(l, map.getOrDefault(l, 0) + 1);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
		HashMap<String, Integer> result = findFrequency(input);
        System.out.println(result);

	}

}
