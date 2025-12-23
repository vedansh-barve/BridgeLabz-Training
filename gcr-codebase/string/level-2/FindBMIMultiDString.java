import java.util.Scanner;

public class FindBMIMultiDString
{
    public static double[][] findBMIAndStatus(int person)
    {
	Scanner input = new Scanner(System.in);
	double[][] personData = new double[person][3];
	for(int i=0; i<person; i++)
	{
	    double weight;
	    System.out.print("Enter Weight in Kg of person " + (i+1) + " ");
	    personData[i][0] = input.nextDouble();
	    System.out.print("Enter height in cm of person " + (i+1) + " ");
	    personData[i][1] = input.nextDouble();
	    double heightInMeter = personData[i][1] / 100;
	    personData[i][2] =  personData[i][0] / (heightInMeter * heightInMeter);
	}
	input.close();
	return personData;
    }	
	
    public static String[] findweightStatus(double[][] personData, int person)
    {
	String[] weightStatus = new String[person];
	for(int i=0; i<person; i++)
	{	
	    if(personData[i][2] <= 18.4)
	        weightStatus[i] = "Underweight";
	    else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9)
	        weightStatus[i] = "Normal";
	    else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9)
		weightStatus[i] = "Overweight";	        
	    else
	        weightStatus[i] = "Obese";
	}
	return weightStatus;
    }
	
    public static void displayData(double[][] personData, String[] weightStatus, int person)
    {
	for(int i=0; i<person; i++)
	{
	    System.out.println("Person " + (i+1) + "BMI is:  " + personData[i][2] + " and his Status: " + weightStatus[i]);
	}
    }

    public static void main(String args[])
    {
	int person = 10;
	double[][] personData = findBMIAndStatus(person);
	String[] weightStatus = findweightStatus(personData, person);
	displayData(personData, weightStatus, person);
    }
}
