package com.day10.bagnball;
import java.util.*;

public class Bag {
	private String bagID;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls;

    public Bag(String bagID, String color, int capacity) {
        this.bagID = bagID;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public boolean addBall(Ball b) {
        if (balls.size() >= capacity) {
            System.out.println("Cannot add ball. Bag " + bagID + " is full.");
            return false;
        }
        balls.add(b);
        System.out.println("Added " + b.getBallID() + " to Bag " + bagID);
        return true;
    }

    // Remove a ball by ID
    public boolean removeBall(String ballID) {
        for (Ball b : balls) {
            if (b.getBallID().equals(ballID)) {
                balls.remove(b);
                System.out.println("Removed " + ballID + " from Bag " + bagID);
                return true;
            }
        }
        System.out.println("Ball " + ballID + " not found in Bag " + bagID);
        return false;
    }

    public void displayBalls() {
        System.out.println("Balls in Bag " + bagID + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
        } else {
            for (Ball b : balls) {
                System.out.println(b);
            }
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    @Override
    public String toString() {
        return "Bag[ID=" + bagID + ", Color=" + color + ", Capacity=" + capacity +
                ", BallCount=" + getBallCount() + "]";
    }
}
