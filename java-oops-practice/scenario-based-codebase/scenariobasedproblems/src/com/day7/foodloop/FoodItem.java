package com.day7.foodloop;

public class FoodItem {
	private String name;
	private double price;
	private boolean available;
	private int itemStock;
	
	protected String category;
	
	public FoodItem(String name, double price, boolean available, int itemStock) {
		this.name = name;
		this.price = price;
		this.available = available;
		this.itemStock = itemStock;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean hasStock() {
        return itemStock > 0;
    }
	
	protected void reduceStock() {
		itemStock--;
		if(itemStock <= 0) {
			available = false;
		}
	}
	
	protected void improveStock() {
		itemStock++;
	}
}
