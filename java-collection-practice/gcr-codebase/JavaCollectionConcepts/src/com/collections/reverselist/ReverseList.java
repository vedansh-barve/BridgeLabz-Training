package com.collections.reverselist;
import java.util.*;

public class ReverseList {
	
	public static ArrayList reverseArrayList(ArrayList<Integer> list) {
		int n = list.size();
		
		int i = 0,  j = n-1;
		
		while(i < j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
		return list;
	}
	
	public static LinkedList reverseLL(LinkedList<Integer> list) {
		
		LinkedList<Integer> ansList = new LinkedList<>();
		ListIterator<Integer> l = list.listIterator(list.size());
		
		while(l.hasPrevious()) {
			ansList.add(l.previous());
		}
		return ansList;
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		
		arrList = reverseArrayList(arrList);
		for(int l: arrList) {
			System.out.print(l + " ");
		}
		System.out.println();
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll = reverseLL(ll);
		for(int l: ll) {
			System.out.print(l + " ");
		}
	}
}
