package com.day7.foodloop;

public class NonVegItem extends FoodItem{
	
	public NonVegItem(String name, double price, boolean available, int itemStock) {
		super(name, price, available, itemStock);
		this.category = "Non-Veg";
	}
}
