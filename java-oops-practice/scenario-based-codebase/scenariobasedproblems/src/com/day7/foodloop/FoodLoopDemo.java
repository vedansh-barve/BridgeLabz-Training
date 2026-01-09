package com.day7.foodloop;
import java.util.*;

public class FoodLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodItem pizza = new VegItem("Paneer Pizza", 250, true, 1);
        FoodItem burger = new NonVegItem("Chicken Burger", 300, true, 0);
        FoodItem fries = new VegItem("French Fries", 150, true, 5);

        User user = new User("Vedansh");

        Order cart = user.getCurrentOrder();

        cart.addItemToCart(pizza);   // available
        cart.addItemToCart(burger);  // out of stock
        cart.addItemToCart(fries);   // available

        user.placeOrder(null);
		
	}

}
