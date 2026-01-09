package com.day7.foodloop;
import java.util.*;

public class Restaurant {
	
	private String name;
	private List<FoodItem> foodItems;
	
	public Restaurant(String name, List<FoodItem> foodItems) {
		this.name = name;
		foodItems = new ArrayList<>();
	}
	
	public void addFoodItem(FoodItem foodItem) {
		foodItems.add(foodItem);
	}
	
	public List<FoodItem> getFoodItems() {
        return foodItems;
    }

}
