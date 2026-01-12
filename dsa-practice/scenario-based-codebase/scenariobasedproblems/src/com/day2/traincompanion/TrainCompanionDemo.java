package com.day2.traincompanion;

public class TrainCompanionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train rajdhani = new Train("Rajdhani Expresss");
		rajdhani.insertCoachAtEnd("General");
		rajdhani.insertCoachAtEnd("S1");
		rajdhani.insertCoachAtEnd("S2");
		rajdhani.insertCoachAtEnd("S3");
		rajdhani.insertCoachAtEnd("B1");
		rajdhani.insertCoachAtEnd("B2");
		rajdhani.insertCoachAtEnd("M1");
		rajdhani.insertCoachAtEnd("M2");
		
		Passenger mukesh = new Passenger("Mukesh");
        mukesh.boardTrain(rajdhani);

        mukesh.moveForward();
        mukesh.moveForward();
        mukesh.checkAdjacent();

        rajdhani.removeCoach("B2");
        rajdhani.showCoaches();
	}

}
