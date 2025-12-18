import java.util.Scanner;

public class FindBMIOfPerson
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double weight, height;
	System.out.print("Enter Weight in Kg: ");
	weight = input.nextDouble();
	System.out.print("Enter Height in Cm: ");
	height = input.nextDouble();
	double heightInMeter = height / 100;
	double bmi =  weight / (heightInMeter * heightInMeter);
	
	if(bmi <= 18.4)
	    System.out.println("Underweight");
	else if(bmi >= 18.5 && bmi <= 24.9)
	    System.out.println("Normal");
	else if(bmi >= 25.0 && bmi <= 39.9)
	    System.out.println("Overweight");
	else
	    System.out.println("Obese");
	
	input.close();
    }
}

