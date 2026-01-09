package com.day7.foodloop;
import java.util.*;

public class User implements IOrderable{
	
	private String name;
	private Order currentOrder;
	
	public User(String name){
		this.name = name;
		this.currentOrder = new Order();
	}
	
	public Order getCurrentOrder() {
        return currentOrder;
    }
	
	@Override
	public void placeOrder(List<FoodItem> orderItems) {
		// create order here
		System.out.println("--------------- Order Created Successfully -----------------");
		System.out.println("Order placed by " + name);
        currentOrder.confirmOrder();		
	}
	
	@Override
	public void cancelOrder() {
		if(currentOrder != null) {
			System.out.println("Your order Cancel Successfully.......");
			currentOrder.confirmCancelOrder();
		}
		else {
			System.out.println("You do not have any order right now...");
		}
	}
}
