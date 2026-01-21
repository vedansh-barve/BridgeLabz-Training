package com.day9.medwarehouse;

public class MergeSort {

	public static void mergeSort(Medicine[] medicines, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			mergeSort(medicines, left, mid);
			mergeSort(medicines, mid+1, right);
			
			merge(medicines, left, mid, right);
		}
	}
	
	private static void merge(Medicine[] medicines, int left, int mid, int right) {
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		Medicine[] L = new Medicine[size1];
		Medicine[] R = new Medicine[size2];
		
		for(int i=0; i<size1; i++)
			L[i] = medicines[left + i];
		
		for(int i=0; i<size2; i++)
			R[i] = medicines[mid + 1 + i];
		
		int i = 0, j = 0, k = left;
		while(i < size1 && j < size2) {
			if(L[i].expiry.compareTo(R[j].expiry) < 0) {
				medicines[k] = L[i];
				i++;
			}
			else {
				medicines[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < size1) {
			medicines[k++] = L[i++];
		}
		
		while(j < size2) {
			medicines[k++] = R[j++];
		}
	}
}
