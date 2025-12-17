import java.util.Scanner;

public class DoubleOperation
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);	
	double a, b, c;
	a = input.nextDouble();	
	b = input.nextDouble();	
	c = input.nextDouble();	

	double opt1 = a + b *c;
	double opt2 = a * b + c;
	double opt3 = c + a / b;
	double opt4 = a % b + c;
	
	System.out.print("The results of Double Operations are "+ opt1 + ", " + opt2 + ", " + opt3 + " and" + opt4);

    }
}