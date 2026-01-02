package com.bridgelabz.oops.encapsulation.ecommerceplatform;

public class Electronic extends Product implements Taxable{
	private double taxRate = 0.07; // 7%
	private double discount = 0.10;
	
	
	public Electronic(int productId, String name, double price) {
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
		System.out.println(taxRate + "% Tax on Electronics");
	}
}
