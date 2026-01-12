package com.day2.callcenter;
import java.util.*;

public class CallCenter {
	
	private String name;
	private Queue<Customer> incomingCalls;
	private PriorityQueue<Customer> vipQueue;
	
	private HashMap<String, Integer> countCallMap;
	
	public CallCenter(String name) {
		this.name = name;
		incomingCalls = new LinkedList<>();
		countCallMap = new HashMap<>();
		vipQueue = new PriorityQueue<>((c1, c2) -> c1.customerId.compareTo(c2.customerId)
	        );
	}
	
	public void addCall(Customer customer) {
		countCallMap.put(customer.customerId, countCallMap.getOrDefault(customer.customerId, 0) + 1);
		
		if(customer.isVip) {
			vipQueue.offer(customer);
		}
		else {
			incomingCalls.offer(customer);
		}
	}
	
	public void serveCall() {
		Customer customer;
		if(!vipQueue.isEmpty()) {
			customer = vipQueue.poll();
		}
		else if(!incomingCalls.isEmpty()) {
			customer = incomingCalls.poll();
		}
		else {
			System.out.println("No call in a  queue.....");
			return ;
		}
		
		System.out.println("Serving : " + customer.name);
	}
	
	public void displayCalls() {
		if(countCallMap.isEmpty()) {
			System.out.println("Nothing to Display....");
		}
		else {
			System.out.print("Call Count Data....: ");
	        for (String id : countCallMap.keySet()) {
	            System.out.println("Customer ID " + id + " → Calls: " + countCallMap.get(id));
	        }
		}
	}
	
}
