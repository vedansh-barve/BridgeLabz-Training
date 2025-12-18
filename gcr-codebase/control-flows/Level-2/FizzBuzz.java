import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	
	if(number > 0)
	{
	    for(int strt = 1; strt <= number; strt++)
	    {
 	        if(strt%3 == 0 && strt%5 == 0)
		{
		    System.out.println(strt + " = " + "FizzBuzz");
		}
		else if(strt%5 == 0)
		{
		    System.out.println(strt + " = " + "Buzz");
		}
		else if(strt%3 == 0)
		{
		    System.out.println(strt + " = " + "Fizz");
		}
		else
		{
		    System.out.println(strt + " = " + "__");
		}	       
	    }
	}	
	else
	{
	    System.out.println("Number is negative");
	}
    }
}

