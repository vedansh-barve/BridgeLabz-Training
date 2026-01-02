package com.hospitalmanagementsystem;

public class Bill implements Payable{
	
	private double amount;
	private double taxRate = 0.05;
	private double discountRate = 0.10;
	
	public Bill(double amount) {
		this.amount = amount;
	}
	
	@Override
	public double calculatePayment() {
		double tax = amount * taxRate;
		double discount = amount * discountRate;
		double totalAmount = (amount + tax) - discount;
		return totalAmount;
	}
}
