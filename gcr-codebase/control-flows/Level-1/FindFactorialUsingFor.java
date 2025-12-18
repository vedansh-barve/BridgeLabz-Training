import java.util.Scanner;

public class FindFactorialUsingFor
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNo = number;
	
	int factorial = 1;
	for(int strt=1; strt<=number; strt++)
	{
	    factorial *= strt;
	}
	System.out.println("Factorial of " + originalNo + " is " + factorial);
    }
}

