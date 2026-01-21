package com.collections.symmetricdiff;
import java.util.*;

public class SymmetricDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		
		union.removeAll(intersection);
		
		System.out.println("Symmetric Diff: " + union);
	}

}
