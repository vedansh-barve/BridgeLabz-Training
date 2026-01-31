package com.day1.travelLog;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import

public class TravelLog {

	private List<Trip> trips;
	
	public TravelLog() {
		trips = new ArrayList<>();
	}
	
	public void addTrip(Trip trip, String folder) throws IOException {
		trips.add(trip);
		saveToFile(trip, folder);
	}
	
	public void saveToFile(Trip trip, String folder) throws IOException {
		File file = new File(folder);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		String fileName = folder + "/" + trip.getCity() + "_" + trip.getCoutry() + ".ser";
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(trip);
		}		
	}
	
	public List<String> findCities(){
		
		Set<String> allCities = new HashSet<>();
		Pattern p = Pattern.compile("\\b[A-Z][a-z]+\\b");
		
		for(Trip trip: trips) {
			Matcher m = p.matcher(trip.getNotes());
			while(m.find()) {
				allCities.add(m.group());
			}
		}
		
		return new ArrayList<>(allCities);
	}
	
	public void loadTrips(String folder) throws IOException, ClassNotFoundException {
		trips.clear();
		File dir = new File(folder);
		if (!dir.exists() || !dir.isDirectory())
			return;

		for (File file : dir.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".ser")) {
				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
					Trip trip = (Trip) ois.readObject();
					trips.add(trip);
				} catch (Exception e) {
					System.out.println("Skip bad file: " + file.getName());
				}
			}
		}
	}
	
	public List<Trip> longTrips(){
		List<Trip> longTripsResult = new ArrayList<>();
		for(Trip trip: trips) {
			if(trip.getDurationDays() > 5) {
				longTripsResult.add(trip);
			}
		}
		return longTripsResult;
	}
	
	public Set<String> uniqueCountries(){
		Set<String> uniqueOne = new HashSet<>();
		for(Trip trip: trips) {
			uniqueOne.add(trip.getCountry());
		}
		return uniqueOne;
	}
	
	public List<String> topCities(){
		Map<String, Integer> counts = new HashMap<>();
		
		for(Trip trip: trips) {
			counts.put(trip.getCity(), counts.getOrDefault(trip.getCity(), 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(counts.entrySet());
		list.sort((a, b) -> b.getValue() - a.getValue());
		
		List<String> top = new ArrayList<>();
		for(int i=0; i<Math.min(3, list.size()); i++) {
			top.add(list.get(i).getKey() + "(" + list.get(i).getValue() + ")");
		}
		return top;
	}
	
}
