import java.util.Scanner;

public class TriangularPark
{
    int calcDistance(double side1, double side2, double side3)
    {
	double perimeter = (side1 + side2 + side3);
	int totalDistance = 5000;
	int rounds = (int) Math.ceil(totalDistance / perimeter);
	return rounds;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	double side1, side2, side3;
	System.out.print("Enter Side1 Distance in meter: ");
	side1 = input.nextDouble();
	System.out.print("Enter Side2 Distance in meter: ");
	side2 = input.nextDouble();
	System.out.print("Enter Side3 Distance in meter: ");
	side3 = input.nextDouble();

	TriangularPark obj = new TriangularPark();
	int rounds = obj.calcDistance(side1, side2, side3);
	System.out.print("Athlete need to run rounds " + rounds);
	
    }
}