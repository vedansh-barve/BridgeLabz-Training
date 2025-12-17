import java.util.Scanner;

public class convertHeight
{
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	double heightInCm;
	
	System.out.print("Enter your height in cm: ");
	heightInCm = input.nextDouble();

	double totalInches = heightInCm / 2.54;

        double heightInFeet = (totalInches / 12);
        double heightInInches = totalInches % 12;
	
	System.out.print("Your Height in cm is "+ heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
        
    }
}