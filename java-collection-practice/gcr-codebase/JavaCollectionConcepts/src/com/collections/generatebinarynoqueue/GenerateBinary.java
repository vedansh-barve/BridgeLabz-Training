package com.collections.generatebinarynoqueue;
import java.util.*;

public class GenerateBinary {

	public static List<String> generateBinary(int n){
		
		List<String> list = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();
		
		queue.add("1");
		
		for(int i=0; i<n; i++) {
			String front = queue.remove();
			list.add(front);
			
			queue.add(front + "0");
			queue.add(front + "1");
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		List<String> result = generateBinary(n);
		System.out.println(result);
	}

}
