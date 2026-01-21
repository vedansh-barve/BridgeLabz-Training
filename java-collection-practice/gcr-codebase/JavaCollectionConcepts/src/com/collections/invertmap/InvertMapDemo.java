package com.collections.invertmap;
import java.util.*;

public class InvertMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        
        InvertMap.invertMap(input);
	}

}
