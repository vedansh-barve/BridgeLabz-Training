import java.util.Scanner;

public class PerimeterOfSquare
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	float perimeter;
	
	System.out.print("Enter perimeter: ");
	perimeter = input.nextFloat();
			
	float side = perimeter/4;
	
	System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}