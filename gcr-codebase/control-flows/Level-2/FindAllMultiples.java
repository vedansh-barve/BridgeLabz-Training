import java.util.Scanner;

public class FindAllMultiples
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	
	if(number > 0 && number < 100)
	{	
	    int counter = number-1;
	    while(counter > 1)
	    {
	        if(number%counter == 0)
		{
		     System.out.println(counter);   
		}
		counter--;
	    }
	}
	else
	{
	    System.out.println("Invalid Number");
	}
    }
}

