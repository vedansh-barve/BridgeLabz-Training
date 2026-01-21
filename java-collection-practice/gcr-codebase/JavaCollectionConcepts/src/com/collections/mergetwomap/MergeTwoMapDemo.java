package com.collections.mergetwomap;
import java.util.*;

public class MergeTwoMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Result map 
        Map<String, Integer> result = new HashMap<>(map1);

        // Merge map2 into result
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println(result);
	}

}
