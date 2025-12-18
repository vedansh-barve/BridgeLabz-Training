import java.util.Scanner;

public class FindAllMultiplesUsingFor
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	
	if(number > 0 && number < 100)
	{	
	    for(int counter = number-1; counter > 1; counter--)
	    {
	        if(number%counter == 0)
		{
		     System.out.println(counter);   
		}
	    }
	}
	else
	{
	    System.out.println("Invalid Number");
	}
    }
}

