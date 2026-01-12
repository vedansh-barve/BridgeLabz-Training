package com.day2.traincompanion;

public class Node {
	public String compartmentName;
	Node next;
	Node prev;
	
	public Node(String compartmentName) {
		this.compartmentName = compartmentName;
		this.next = null;
		this.prev = null;
	}
}
