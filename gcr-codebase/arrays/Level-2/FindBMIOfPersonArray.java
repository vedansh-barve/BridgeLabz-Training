import java.util.Scanner;

public class FindBMIOfPersonArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.println("Enter a number of person: ");
	number = input.nextInt();
	double[] weight = new double[number];
	double[] height = new double[number];
	
	for(int i=0; i<number; i++)
	{
	    System.out.print("Enter Weight in Kg of person " + (i+1) + " ");
	    weight[i] = input.nextDouble();
	    System.out.print("Enter height in cm of person " + (i+1) + " ");
	    height[i] = input.nextDouble();
	}
	
	for(int i=0; i<number; i++)
	{
	   
	    double heightInMeter = height[i] / 100;
	    double bmi =  weight[i] / (heightInMeter * heightInMeter);
	
	    if(bmi <= 18.4)
	        System.out.println("Underweight");
	    else if(bmi >= 18.5 && bmi <= 24.9)
	        System.out.println("Normal");
	    else if(bmi >= 25.0 && bmi <= 39.9)
	        System.out.println("Overweight");
	    else
	        System.out.println("Obese");
	}
	
	
	input.close();
    }
}

