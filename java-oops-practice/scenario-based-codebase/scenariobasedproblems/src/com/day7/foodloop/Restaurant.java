package com.day7.foodloop;
import java.util.*;

public class Restaurant {
	
	private String name;
	private List<FoodItem> foodItems;
	
	public Restaurant(String name, List<FoodItem> foodItems) {
		this.name = name;
		this.foodItems = new ArrayList<>();
	}
	
	public void addFoodItem(FoodItem foodItem) {
		foodItems.add(foodItem);
	}
	
	public void getFoodItems() {
        if(foodItems == null) {
           	System.out.println("Nothing Currently..");
        }
        else {
        	System.out.print("Food Items: ");
        	for(FoodItem item: foodItems) {
        		System.out.println(name + " ");
        	}
        }
    }

}
