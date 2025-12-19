import java.util.Scanner;

public class FizzBuzzArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	String[] arr = new String[number+1];
	
	if(number > 0)
	{
	    for(int strt = 1; strt <= number; strt++)
	    {
 	        if(strt%3 == 0 && strt%5 == 0)
		{
		    arr[strt-1] = "FizzBuzz";
		}
		else if(strt%5 == 0)
		{
		    arr[strt-1] = "Buzz";
		}
		else if(strt%3 == 0)
		{
		    arr[strt-1] = "Fizz";
		}
		else
		{
		    arr[strt-1] = "__";
		}	       
	    }
	
	    for(int i=0; i<arr.length; i++)
		System.out.print(arr[i] + ", ");
	}	
	else
	{
	    System.out.println("Number is negative");
	}
    }
}

