import java.util.Scanner;

public class CheckUnitConverterTwo
{
    public static double convertYardToFeet(double yard)
    {
  	return yard*3;
    }
    public static double convertFeetToYard(double feet)
    {
  	return feet*0.333333;		
    }
    public static double convertMeterToInches(double meter)
    {
  	return meter*39.3701;
    }
    public static double convertInchesToMeter(double inches)
    {
  	return inches*0.0254;
    }
    public static double convertInchesToCm(double inches)
    {
  	return inches*2.54;
    }   

    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	double yard, feet, meter, inches;
	System.out.print("Enter km value: ");
	yard = input.nextDouble();
	System.out.print("Enter miles value: ");
	feet = input.nextDouble();
	System.out.print("Enter meter value: ");
	meter = input.nextDouble();
	System.out.print("Enter inches value: ");
	inches = input.nextDouble();
	
  	System.out.println("From yard to feet: " + convertYardToFeet(yard));
	System.out.println("From feet to yard: " + convertFeetToYard(feet));
	System.out.println("From meter to inches: " + convertMeterToInches(meter));
	System.out.println("From inches to meter: " + convertInchesToMeter(inches));
	System.out.println("From inches to cm: " + convertInchesToCm(inches));
    }
}