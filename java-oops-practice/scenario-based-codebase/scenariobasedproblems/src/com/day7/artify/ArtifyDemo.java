package com.day7.artify;

public class ArtifyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artist ravi = new Artist("Ravi", 27);
		DigitalArt d1 = new DigitalArt("Painting", ravi, 230, "Personal Use");
		PrintArt d2 = new PrintArt("Armory", ravi, 800, "Valid for 1 Year");
		
		User ashish = new User("Ashish", 900);
		
		d1.purchase(ashish);
		d2.purchase(ashish);	}

}
