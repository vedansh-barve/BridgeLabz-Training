package com.day2.traincompanion;

public class Passenger {
	
	private String name;
	Train boardedTrain;
	
	public Passenger(String name) {
		this.name = name;
//		boardTrain = new LinkedList();
	}
	
	public void boardTrain(Train boardTrain) {
		boardedTrain = boardTrain;
		System.out.println(name + " Successfully Board " + boardedTrain.getName());
	}
	
	public void moveForward() {
		boardedTrain.goforward();
	}
	
	public void moveBackward() {
		boardedTrain.gobackward();
	}
	
	public void checkAdjacent() {
        boardedTrain.showAdjacentCoaches();
    }
	
}
