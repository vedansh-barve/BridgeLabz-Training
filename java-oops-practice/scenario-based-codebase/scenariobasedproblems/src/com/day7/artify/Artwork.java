package com.day7.artify;

public abstract class Artwork{
	private String title;
	private double price;
	private Artist artist;
	
	protected String licenseType;
	
	public Artwork(String title, Artist artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}
	
	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}
	
	// abstract method
	public abstract void license();
	
}
