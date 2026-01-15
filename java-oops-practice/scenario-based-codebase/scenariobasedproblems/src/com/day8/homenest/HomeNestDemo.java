package com.day8.homenest;

public class HomeNestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 User user = new User("Alice");

		 Device light = new Light("L101");
		 Device camera = new Camera("C201");
		 Device thermostat = new Thermostat("T301");
		 Device lock = new Lock("K-401");

		 user.registerDevice(light);
		 user.registerDevice(camera);
		 user.registerDevice(thermostat);
		 user.registerDevice(lock);

		 light.turnOn();
		 camera.turnOn();

		 System.out.println("Monthly energy (Light): " + light.calculateMonthlyEnergy(6) + " kWh");
		 user.resetAllDevices();
	}

}
