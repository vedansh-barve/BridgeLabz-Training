package com.collections.findsubset;
import java.util.*;

public class FIndSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		
		boolean isSubset = set2.containsAll(set1);
		System.out.println(isSubset);
	}

}
