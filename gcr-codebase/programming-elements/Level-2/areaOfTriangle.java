import java.util.Scanner;

public class areaOfTriangle
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int base;
	int height;
	System.out.print("Enter Base: ");
	base = input.nextInt();
	System.out.print("Enter Height: ");
	height = input.nextInt();       
	double areaInSqCm = 0.5 * base * height;
        double areaInInches = areaInSqCm / (2.54 * 2.54);

	System.out.print("The Area of the triangle in sq in is " + areaInInches + " and sq cm is " + areaInSqCm);

    }
}