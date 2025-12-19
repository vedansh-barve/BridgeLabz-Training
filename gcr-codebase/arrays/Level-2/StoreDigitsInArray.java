import java.util.Scanner;

public class StoreDigitsInArray
{	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNumber = number;
	int totalDigits = 0;
	int largest = -1;
	while(number != 0)
	{
	    int digit = number%10;
	    totalDigits++;
	    number /= 10;
	    if(digit > largest)
		largest = digit;
	}
	
	int[] digitsArr = new int[totalDigits];
	number = originalNumber;
	int index = 0;
	
	int secondLargest = -1;
	while(number != 0)
	{
	    int digit = number%10;
	    digitsArr[index++] = digit;
	    number /= 10;
	    if(digit > secondLargest && digit != largest)
		secondLargest = digit;
	}
	
	int i = 0, j = totalDigits - 1;
	while(i < j)
	{
	    int temp = digitsArr[i];
	    digitsArr[i] = digitsArr[j];
	    digitsArr[j] = temp;
	    i++;
	    j--;
	}	
	System.out.println("The largest Element is: " + largest);
	System.out.println("The second largest Element is: " + secondLargest);

	input.close();	
    }
}

