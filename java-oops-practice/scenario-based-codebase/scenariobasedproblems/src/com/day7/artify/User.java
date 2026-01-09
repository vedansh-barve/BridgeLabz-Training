package com.day7.artify;
import java.util.*;

public class User {
	private String name;
	private double walletBalance;
	
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance; 
	}
	
	public String getName() {
		return name;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	
	public void setWalletBalance(double amount) {
		walletBalance += amount;
	}
}
