import java.util.Scanner;

public class CalculateWindTemprature
{
    public static double findWindTemprature(double temprature, double windSpeed)
    {
	double windChill = 35.74 + 0.6215 *temprature + (0.4275*temprature - 35.75) * Math.pow(windSpeed, 0.16);
	return windChill;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	double temprature, windSpeed;
	System.out.print("Enter Temprature: ");
	temprature = input.nextInt();
	System.out.print("Enter wind Speed: ");
	windSpeed = input.nextInt();
	double windChillTemp = findWindTemprature(temprature, windSpeed);
	System.out.println("The wind chill temperature: " + windChillTemp);
	
    }
}