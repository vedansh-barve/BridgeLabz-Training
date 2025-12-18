import java.util.Scanner;

public class CheckLargestNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number1, number2, number3;
	number1 = input.nextInt();
	number2 = input.nextInt();
	number3 = input.nextInt();

	if(number1 > number2 && number1 > number3)
	{
	System.out.println("Is the first number the largest? Yes.");
	System.out.println("Is the second number the largest? No.");
	System.out.print("Is the second number the largest? No.");
	}	
	else if(number2 > number1 && number2 > number3)
	{
	System.out.println("Is the first number the largest? No.");
	System.out.println("Is the second number the largest? Yes.");
	System.out.println("Is the third number the largest? No.");
	}
	else
	{
	System.out.println("Is the first number the largest? No.");
	System.out.println("Is the second number the largest? No.");
	System.out.println("Is the third number the largest? Yes.");
	}
    }
}

