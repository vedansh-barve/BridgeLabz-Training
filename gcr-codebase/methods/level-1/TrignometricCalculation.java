import java.util.Scanner;

public class TrignometricCalculation
{
    public double[] calcTrignometric(double angle)
    {
	double radians = Math.toRadians(angle);

        double[] resultArr = new double[3];
        resultArr[0] = Math.sin(radians); 
        resultArr[1] = Math.cos(radians); 
        resultArr[2] = Math.tan(radians); 

        return resultArr;	
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	double angle;
	System.out.print("Enter Angle: ");
	angle = input.nextDouble();
	
	TrignometricCalculation obj = new TrignometricCalculation();
	double[] resultArr = obj.calcTrignometric(angle);
	System.out.println("Sine: " + resultArr[0]);
	System.out.println("Cosine: " + resultArr[1]);
	System.out.println("Tangent: " + resultArr[2]);
	
    }
}