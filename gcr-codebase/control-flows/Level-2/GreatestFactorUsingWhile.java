import java.util.Scanner;

public class GreatestFactorUsingWhile
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int greatestFactor = 1;
	if(number > 0)
	{	
	    int strt = number-1;
	    while(strt >= 1)
	    {
	        if(number%strt == 0)
		{
		    if(strt > greatestFactor)
			greatestFactor = strt;
		}
		strt--;
	    }
	    System.out.println("Greatest Factor is: " + greatestFactor);
	}
    }
}

