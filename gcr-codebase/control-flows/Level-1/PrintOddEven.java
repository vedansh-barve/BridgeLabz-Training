import java.util.Scanner;

public class PrintOddEven
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int originalNo = number;
	
	for(int strt=1; strt<=number; strt++)
	{
	    if(strt%2 == 0)
	    {
	        System.out.println("The number " + strt + " is Even");
	    }
	    else
	    {
	        System.out.println("The number " + strt + " is Odd");
	    }
	}
    }
}

