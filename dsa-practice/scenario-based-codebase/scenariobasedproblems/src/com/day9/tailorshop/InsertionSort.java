package com.day9.tailorshop;

public class InsertionSort {

	public static void insertionSort(Order[] orders) {
		
		int n = orders.length;
		for(int i=1; i<n; i++) {
			Order curr = orders[i];
			int j = i-1;
			
			while(j >= 0 && orders[j].deadline.compareTo(curr.deadline) > 0) {
				orders[j+1] = orders[j];
				j--;
			}
			
			orders[j + 1] = curr;
		}
	}
}
