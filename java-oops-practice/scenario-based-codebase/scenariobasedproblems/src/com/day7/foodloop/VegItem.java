package com.day7.foodloop;

public class VegItem extends FoodItem {
	
	public VegItem(String name, double price, boolean available, int itemStock) {
		super(name, price, available, itemStock);
		this.category = "Veg";
	}
	
}
