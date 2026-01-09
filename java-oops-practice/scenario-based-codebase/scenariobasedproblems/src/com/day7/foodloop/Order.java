package com.day7.foodloop;
import java.util.*;

public class Order {
	private double total;
	List<FoodItem> orderedItems = new ArrayList<>();
	
	public Order() {
		orderedItems = new ArrayList<>();
	}
	
	public void addItemToCart(FoodItem item) {
		if (!item.hasStock()) {
			System.out.println(item.getName() + " is OUT OF STOCK");
			return;
		}
		orderedItems.add(item);
		System.out.println(item.getName() + " added to cart");
	}
	
	public void calculateTotal() {
		total = 0;
		for(FoodItem foodItem: orderedItems) {
			total += foodItem.getPrice();
		}
		total = total - applyDiscount();
	}
	
	public double applyDiscount() {
		if (total > 500) {
            return total * 0.10; // 10% discount
        }
        return 0;
	}
	
	public double getTotal() {
		return total;
	}

	public void confirmOrder() {
		 calculateTotal();
		for (FoodItem item : orderedItems) {
			item.reduceStock();
		}
		System.out.println("Order Confirmed...... Total = " + total);
	}
	
	public void confirmCancelOrder() {
		for(FoodItem item: orderedItems) {
			item.improveStock();
		}
	}
	
}
