import java.util.Scanner;

public class inputKmtoMiles
{
    public static void main(String args[])
    {
        double km;   
	Scanner input = new Scanner(System.in);
	km = input.nextInt();
	double inMiles = (km/1.6);
	System.out.print("The total miles is " + inMiles + " mile for the given " + km + "km");
    }
}