import java.util.Scanner;

public class findDistance
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double distInFeet;
	System.out.print("Enter distance in feet: ");
	distInFeet = input.nextDouble();
	double yard = distInFeet/3;
	double mile = yard/1760;
	
	System.out.print("The distance in yards is " + yard + " while the distance in miles is " + mile);

    }
}