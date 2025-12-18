import java.util.Scanner;

public class CheckAbundantNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNumber = number;
	int totalSum = 0;
	
	for(int i=1; i<=number/2; i++)
	{
	    if(number%i == 0)
	        totalSum += i;
	}
	
	if(originalNumber < totalSum)
	    System.out.println("Abundant Number");
	else
	    System.out.println("Not a Abundant Number");
    }
}

