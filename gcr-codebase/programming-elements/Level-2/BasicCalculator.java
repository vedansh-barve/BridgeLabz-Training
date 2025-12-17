import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);	
	float number1;
	float number2;

        System.out.print("Enter first Number: ");
	number1 = input.nextFloat();

	System.out.print("Enter second Number: ");
	number2 = input.nextFloat();

	float add = (number1 + number2);
	float subs = (number1 - number2);
	float divid = (number1 / number2);
	float multi = (number1 * number2);

	System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers "+ number1 +" and "+ number2 +" is " + add);
	System.out.print(" " + subs);
	System.out.print(" " + multi);
	System.out.print(" " + divid);
    }
}