import java.util.Scanner;

public class FindFactorial
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNo = number;
	
	int factorial = 1;
	while(number > 0)
	{
	    factorial *= number;
	    number--;
	}
	System.out.println("Factorial of " + originalNo + " is " + factorial);
    }
}

