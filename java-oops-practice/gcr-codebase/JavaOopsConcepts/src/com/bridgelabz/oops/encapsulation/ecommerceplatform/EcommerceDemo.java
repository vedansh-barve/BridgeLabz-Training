package com.bridgelabz.oops.encapsulation.ecommerceplatform;
import java.util.*;

public class EcommerceDemo {

	public static void printFinalPrice(List<Product> products) {
		
		for(Product product: products) {
			double tax = 0;
			
			if(product instanceof Taxable) {
				tax = ((Taxable) product).calculateTax();
			}
			
			double discount = product.calculateDiscount();
			double finalAmount = product.getProductPrice() + tax - discount;
			
			System.out.println("Product: " + product.getProductName());
            System.out.println("Base Price: " + product.getProductPrice());
            System.out.println("Tax: " + tax);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalAmount);
            System.out.println("--------------------------------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Electronic(1011, "Mouse", 1900));
		products.add(new Clothing(2011, "Shirt", 1399));
		products.add(new Groceries(1021, "Rice", 245));
		
		printFinalPrice(products);
		
	}

}
