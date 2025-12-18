import java.util.Scanner;

public class FactorsOfNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();

	if(number > 0)
	{	
	    for(int strt=1; strt<=number; strt++)
	    {
	        if(number%strt == 0)
		{
		    System.out.println(strt);
		}
	    }
	}
    }
}

