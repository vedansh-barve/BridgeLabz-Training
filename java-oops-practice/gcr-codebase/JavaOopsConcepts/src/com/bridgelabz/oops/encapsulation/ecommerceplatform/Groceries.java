package com.bridgelabz.oops.encapsulation.ecommerceplatform;

public class Groceries extends Product implements Taxable{
	private double taxRate = 0.05; // 5%
	private double discount = 0.20;
	
	
	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
	}
	
	@Override
	public double calculateTax() {
		return getProductPrice() * taxRate;
	}
	
	@Override
	public double calculateDiscount() {
		return getProductPrice()*discount;
	}
	
	@Override
	public void getTaxDetails() {
		System.out.println(taxRate + "% Tax on Groceries");
	}
}
