import java.util.Scanner;
import java.util.Arrays;

public class ReverseNumber
{	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	long number;
	System.out.print("Enter Number: ");
	number = input.nextLong();
	long originalNumber = number;
	
	int noOfDigits = 0;
	while(number != 0)
	{
	    noOfDigits++;
	    number /= 10;
	}
	
	int[] digitsArr = new int[noOfDigits];
	number = originalNumber;
	int index = 0;

	while(number != 0)
	{
       	    int digit = (int)number % 10;
   	    digitsArr[index++] = digit;
    	    number /= 10;
	}
	for(int i=0; i<noOfDigits; i++)
	    System.out.print(digitsArr[i]);
		
	input.close();	
    }
}

