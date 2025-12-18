import java.util.Scanner;

public class GreatestFactor
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
	    for(int strt = number-1; strt >= 1; strt--)
	    {
	        if(number%strt == 0)
		{
		    if(strt > greatestFactor)
			greatestFactor = strt;
		}
	    }
	    System.out.println("Greatest Factor is: " + greatestFactor);
	}
    }
}

