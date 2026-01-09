package com.day7.foodloop;

import java.util.List;

public interface IOrderable {
	void placeOrder(List<FoodItem> orderItems);
	void cancelOrder();
}
