package com.bridgelabz.oops.encapsulation.ecommerceplatform;

abstract class Product{
	
	private int productId;
	private String name;
	private double price;
	
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return name;
	}
	
	public double getProductPrice() {
		return price;
	}
	
	public void setProductPrice(double p) {
		this.price = p;
	}
	
	//abstract method
	public abstract double calculateDiscount();
	
	public void displayDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}
}
