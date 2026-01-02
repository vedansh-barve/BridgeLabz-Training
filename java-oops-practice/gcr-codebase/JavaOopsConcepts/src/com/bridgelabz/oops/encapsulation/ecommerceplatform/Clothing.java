package com.bridgelabz.oops.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable{
	private double taxRate = 0.05; // 5%
	private double discount = 0.15;
	
	
	public Clothing(int productId, String name, double price) {
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
		System.out.println(taxRate + "% Tax on Clothing");
	}
}
