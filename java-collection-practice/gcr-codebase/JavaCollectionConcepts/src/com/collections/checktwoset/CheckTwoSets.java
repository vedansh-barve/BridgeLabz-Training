package com.collections.checktwoset;
import java.util.*;

public class CheckTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
		
		System.out.println(set1.equals(set2));
	}

}
