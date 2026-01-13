package com.day1.ambulanceroute;

public class AmbulanceRouteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularRoute route = new CircularRoute();
        AmbulanceService ambulance = new AmbulanceService();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayRoute();
        ambulance.routePatient(route.getHead());

        route.removeUnit("Radiology");
        route.displayRoute();
	}

}
