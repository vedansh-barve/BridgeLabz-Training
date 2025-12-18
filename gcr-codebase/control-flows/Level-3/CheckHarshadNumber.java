import java.util.Scanner;

public class CheckHarshadNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNumber = number;
	int totalSum = 0;

	while(number != 0)
	{
	    int digit = number%10;
	    totalSum += digit;
	    number /= 10;
	}
	
	if(originalNumber%totalSum == 0)
	    System.out.println("Harshad Number");
	else
	    System.out.println("Not a Harshad Number");
    }
}

