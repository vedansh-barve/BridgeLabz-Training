package com.day7.artify;

public class PrintArt extends Artwork implements IPurchasable{
	
	public PrintArt(String title, Artist artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void purchase(User user) {
		if(getPrice() <= user.getWalletBalance()) {
			System.out.println(user.getName() + ", Sucessfully purchased Print ArtWork....");
			user.setWalletBalance(-getPrice());
			license();
		}
		else {
			System.out.println("Insufficient Balance...........");
		}
	}
	
	@Override
	public void license() {
		System.out.println("PrintArt License Approved: " + licenseType);
	}
}
