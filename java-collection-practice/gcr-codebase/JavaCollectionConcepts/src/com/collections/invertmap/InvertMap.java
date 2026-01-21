package com.collections.invertmap;
import java.util.*;

public class InvertMap {

	public static void invertMap(Map<String, Integer> input) {
		Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        System.out.println(invertedMap);
	}
}
