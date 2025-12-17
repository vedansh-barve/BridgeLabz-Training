import java.util.Scanner;

public class findQuotientRem
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);	
	double number1;
	double number2;
	System.out.print("Enter number1: ");
	number1 = input.nextInt();
	System.out.print("Enter number2: ");
	number2 = input.nextInt();

	double quotient = number1/number2;
	double remainder = number1%number2;
	
	System.out.print("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

    }
}