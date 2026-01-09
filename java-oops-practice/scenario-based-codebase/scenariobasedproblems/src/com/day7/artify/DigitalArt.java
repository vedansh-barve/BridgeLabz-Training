package com.day7.artify;

public class DigitalArt extends Artwork implements IPurchasable{
	
	public DigitalArt(String title, Artist artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void purchase(User user) {
		if(getPrice() <= user.getWalletBalance()) {
			System.out.println(user.getName() + ", Successfully Purchased Digital Artwork...");
			user.setWalletBalance(-getPrice());
			license();
		}
		else {
			System.out.println("Insufficient Balance.......");
		}
	}
	
	
	@Override
	public void license() {
		System.out.println("DigitalArt License Approved : " + licenseType);
	}
}


