package com.collections.removeduplicates;
import java.util.*;

public class RemoveDuplicates {

	public static List<Integer> removeDuplicates(List<Integer> list){
		
		Set<Integer> set = new LinkedHashSet<>(list);
		return new ArrayList<>(set);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(input));
	}

}
