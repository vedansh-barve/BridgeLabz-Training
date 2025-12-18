import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	
	if(number >= 6 && number <= 9)
	{
	    for(int strt = 1; strt <= 10; strt++)
	    {
	        System.out.println(number + " * " + strt + " = " + (number*strt));
	    }
	}	
	else
	{
	    System.out.println("Not a Valid Number");
	}
    }
}

