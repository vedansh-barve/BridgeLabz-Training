import java.util.Scanner;

public class CalculatorUsingSwitch
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double number1, number2;
	System.out.print("Enter Number1: ");
	number1 = input.nextDouble();
	System.out.print("Enter Number2: ");
	number2 = input.nextDouble();
	
	char operator;
	System.out.print("Enter an Operator (+, -, * , /): ");
	operator = input.next().charAt(0);

	switch(operator)
	{
	case '+':
	    System.out.println("Result is: " + (number1 + number1));
	    break;
	case '-':
	    System.out.println("Result is: " + (number1 - number1));
	    break;
	case '*':
	    System.out.println("Result is: " + (number1 * number1));
	    break;
	case '/':
	    if(number2 != 0)
		System.out.println("Result is: " + (number1 / number1));
	    else
		System.out.println("You cannot aa number divide by zero");
	    break;
	default:
	    System.out.println("Invalid Operator");
	}
	input.close();
    }
}

