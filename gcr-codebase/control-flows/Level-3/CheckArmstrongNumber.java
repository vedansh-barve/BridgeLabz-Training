import java.util.Scanner;

public class CheckArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNumber = number;
	int totalDigits = 0;
	
	while(number > 0)
	{
	    totalDigits++;
	    number /= 10;
	}
	
	number = originalNumber;
	int resultNumber = 0;
	while(number > 0)
	{
	    int digit = number%10;
	    int val = (int) Math.pow(digit, totalDigits);
	    resultNumber += val;
	    number /= 10;
	}

	if(originalNumber == resultNumber)
	    System.out.println("The Number is Armstrong Number"); 
	else
	    System.out.println("The Number is not Armstrong Number");
	
    }
}

