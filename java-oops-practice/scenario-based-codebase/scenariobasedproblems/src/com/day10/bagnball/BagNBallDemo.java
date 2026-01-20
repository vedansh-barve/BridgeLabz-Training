package com.day10.bagnball;
import java.util.*;

public class BagNBallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b1 = new Ball("B1", "Red", "Small");
        Ball b2 = new Ball("B2", "Blue", "Medium");
        Ball b3 = new Ball("B3", "Green", "Large");
        Ball b4 = new Ball("B4", "Yellow", "Small");

        // Create some bags
        Bag bag1 = new Bag("Bag1", "Pink", 2);
        Bag bag2 = new Bag("Bag2", "Blue", 3);

        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        bag1.addBall(b1); 
        bag1.addBall(b2); 
        bag1.addBall(b3); 

        bag2.addBall(b3);
        bag2.addBall(b4);

        bag1.displayBalls();
        bag2.displayBalls();

        bag2.removeBall("B3");

        System.out.println("\nAll Bags:");
        for (Bag b : bags) {
            System.out.println(b);
        }
	}

}
