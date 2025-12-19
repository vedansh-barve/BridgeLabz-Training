import java.util.Scanner;
import java.util.Arrays;

public class StoreDigitsInArrayResize
{	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	long number;
	System.out.print("Enter Number: ");
	number = input.nextLong();
	long originalNumber = number;
	int totalDigits = 10;
	int largest = -1;

	while(number != 0)
	{
	    int digit = (int)number%10;
	    number /= 10;
	    if(digit > largest)
		largest = digit;
	}
	
	int[] digitsArr = new int[10];
	number = originalNumber;
	int index = 0;
	int secondLargest = -1;

	while (number != 0)
	{
    	if (index == totalDigits)
        {
	    int size = index*2;
	    digitsArr = Arrays.copyOf(digitsArr, size);
	}   

    	int digit = (int)number % 10;
   	digitsArr[index++] = digit;
    	number /= 10;

    	if (digit > secondLargest && digit != largest)
       		secondLargest = digit;
	}

	
		
	System.out.println("The largest Element is: " + largest);
	System.out.println("The second largest Element is: " + secondLargest);

	input.close();	
    }
}

