// 11. Temperature Logger 🌡️
// Record temperatures over 7 days.
// Use array and for-loop.
// Find average and max temperature.
// Use if for comparisons. Maintain readable naming and modular code blocks.

import java.util.Scanner;

public class Temprature
{
    public static void recordTemprature()
    {
	Scanner input = new Scanner(System.in);
	double[] days = new double[7];
	double totalTemprature = 0;
	double maxTemprature = 0;
	for(int i=0; i<7; i++)
	{
	    System.out.print("Enter Temprature for Day " + (i+1) + ": ");
	    days[i] = input.nextDouble();
	    totalTemprature += days[i];
	    if(days[i] > maxTemprature)
		maxTemprature = days[i];
	}

	double average = totalTemprature / 7;
	System.out.println("The Average Temprature: " + (average));
	System.out.println("The Maximum Temprature: " + (maxTemprature));
    }

    public static void main(String args[])
    {
	recordTemprature();
    }
}