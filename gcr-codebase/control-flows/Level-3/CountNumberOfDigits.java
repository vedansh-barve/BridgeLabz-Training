import java.util.Scanner;

public class CountNumberOfDigits
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int totalDigits = 0;

	if(number == 0)
	{
	    totalDigits = 1;
	}
	else
	{
	    while(number != 0)
	    {
	        totalDigits++;
	        number /= 10;
	    }
	}	
	System.out.println("Number of Digits are: " + totalDigits);
    }
}

