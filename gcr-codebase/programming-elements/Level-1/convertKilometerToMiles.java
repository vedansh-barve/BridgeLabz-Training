public class convertKilometerToMiles
{
    public static void main(String args[])
    {
        double distanceInKm = 10.8;
	double distanceInMiles = 1.6;
	double distInMiles = (distanceInKm/1.6);
	System.out.print("The distance: " + distanceInKm + "km in miles is: " + distInMiles);
    }
}