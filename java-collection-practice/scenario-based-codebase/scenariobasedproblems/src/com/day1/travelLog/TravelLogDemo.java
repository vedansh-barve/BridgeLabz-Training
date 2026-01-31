package com.day1.travelLog;

public class TravelLogDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		TravelLog manager = new TravelLog();
		
		String folder = "samplefiles/trips";

		// add sample trips
		manager.addTrip(new Trip("Paris", "France", 5,  "Visited Eiffel in Paris"), folder);
		manager.addTrip(new Trip("Berlin", "Germany", 7, "Saw wall in Berlin"), folder);
		manager.addTrip(new Trip("Paris", "France", 4, "Back to Paris and Louvre"), folder);
		manager.addTrip(new Trip("Rome", "Italy", 3, "Colosseum in Rome"), folder);
		manager.addTrip(new Trip("Madrid", "Spain", 8, "Prado in Madrid"), folder);

		// load back
		manager.loadTrips(folder);

		// show summaries
		System.out.println("All cities from notes: \n" + manager.findCities());

		System.out.println("\nLong trips (>5 days): ");
		System.out.println("------------------------------------------------------------");
		for (Trip t : manager.longTrips()) {
			System.out.println(t);
		}
		System.out.println("------------------------------------------------------------");

		System.out.println("\nUnique countries: \n" + manager.uniqueCountries());
		System.out.println("\nTop 3 cities: \n" + manager.topCities());
	}

}
