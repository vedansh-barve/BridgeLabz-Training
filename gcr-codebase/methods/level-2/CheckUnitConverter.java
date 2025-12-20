import java.util.Scanner;
	
class UnitConverter
{   
    public static double convertKmToMiles(double km)
    {
  	return km*0.621;
    }
    public static double convertMilesToKm(double miles)
    {
  	return miles*1.609;		
    }
    public static double convertMeterToFeet(double meter)
    {
  	return meter*3.28;
    }
    public static double convertFeetToMeter(double feet)
    {
  	return feet*0.305;
    }
}

public class CheckUnitConverter
{   
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	double km, miles, meter, feet;
	System.out.print("Enter km value: ");
	km = input.nextDouble();
	System.out.print("Enter miles value: ");
	miles = input.nextDouble();
	System.out.print("Enter meter value: ");
	meter = input.nextDouble();
	System.out.print("Enter feet value: ");
	feet = input.nextDouble();
	
  	System.out.println("From Km to miles: " + UnitConverter.convertKmToMiles(km));
	System.out.println("From miles to km: " + UnitConverter.convertMilesToKm(km));
	System.out.println("From meter to feet: " + UnitConverter.convertMeterToFeet(km));
	System.out.println("From feet to meter: " + UnitConverter.convertFeetToMeter(km));
    }
}