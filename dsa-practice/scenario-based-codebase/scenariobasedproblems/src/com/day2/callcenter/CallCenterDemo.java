package com.day2.callcenter;

public class CallCenterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CallCenter callCenter = new CallCenter("C1");

		 Customer c1 = new Customer("101", "Amit", false);
		 Customer c2 = new Customer("102", "Neha", true);
		 Customer c3 = new Customer("103", "Rahul", false);
		 Customer c4 = new Customer("104", "Priya", true);

		 callCenter.addCall(c1);
		 callCenter.addCall(c2);
		 callCenter.addCall(c3);
		 callCenter.addCall(c4);
		 callCenter.addCall(c1); 
		 callCenter.addCall(c4);

		 callCenter.serveCall();
		 callCenter.serveCall();
		 callCenter.serveCall();
		 callCenter.serveCall();

		 callCenter.displayCalls();;
	}

}
