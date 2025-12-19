import java.util.Scanner;

public class FindBMIMultiDimensional
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.println("Enter a number of person: ");
	number = input.nextInt();
	double[][] personData = new double[number][3];
	String[] weightStatus = new String[number];
		
	for(int i=0; i<number; i++)
	{
	    double weight;
	    System.out.print("Enter Weight in Kg of person " + (i+1) + " ");
	    personData[i][0] = input.nextDouble();
	    System.out.print("Enter height in cm of person " + (i+1) + " ");
	    personData[i][1] = input.nextDouble();
	    double heightInMeter = personData[i][1] / 100;
	    personData[i][2] =  personData[i][0] / (heightInMeter * heightInMeter);
	}
	
	for(int i=0; i<number; i++)
	{	
	    if(personData[i][2] <= 18.4)
	        System.out.println("Underweight");
	    else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9)
	        System.out.println("Normal");
	    else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9)
	        System.out.println("Overweight");
	    else
	        System.out.println("Obese");
	}
	input.close();
    }
}

