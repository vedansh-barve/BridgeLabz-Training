package com.collections.rotateelement;
import java.util.*;

public class RotateElement {

	public static List<Integer> rotate(List<Integer> list, int k){
		int n = list.size();
		k = k%n;
		
		List<Integer> result = new ArrayList<>();
		for(int i=k; i<n; i++) {
			result.add(list.get(i));
		}
		
		for(int i=0; i<k; i++) {
			result.add(list.get(i));
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		list = rotate(list, 2);
		System.out.println(list);
	}

}
