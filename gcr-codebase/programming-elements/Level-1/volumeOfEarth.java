public class volumeOfEarth
{
    public static void main(String args[])
    {
        double earthRadiusKm = 6378.0;   
        double pi = Math.PI;

        double volumeInKm = (4.0 / 3.0) * pi * Math.pow(earthRadiusKm, 3);

        double radiusMiles = earthRadiusKm * 0.621371;
        double volumeInMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);  
	
	System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + "and cubic miles is " + volumeInMiles);      
    }
}