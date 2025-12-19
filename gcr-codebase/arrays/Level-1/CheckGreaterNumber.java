import java.util.Scanner;

public class CheckGreaterNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int[] numbers = new int[5];
	int size = numbers.length;
	
	for(int i=0; i<size; i++)
	{	
	    System.out.print("Enter Number: ");
	    numbers[i] = input.nextInt();   
	}

	for(int i=0; i<size; i++)
	{
	    if(numbers[i] > 0)
	    {
		if(numbers[i] % 2 == 0)
		    System.out.println("Number " + numbers[i] + " is Even");
		else
		   System.out.println("Number " + numbers[i] + " is Odd");
  	    }
	    else if(numbers[i] < 0)
	    	System.out.println("Number is Negative");
	    else
		System.out.println("Number is Zero");
	}
	if(numbers[0] > numbers[size-1])
		System.out.println("Number " + numbers[0] + " is greater than " + numbers[size-1]);
	else if(numbers[0] < numbers[size-1])
		System.out.println("Number " + numbers[0] + " is lesser than " + numbers[size-1]);
	else
		System.out.println("Both " + numbers[0] + " and " + numbers[size-1] + " are equal");

	
	input.close();
	
    }
}

