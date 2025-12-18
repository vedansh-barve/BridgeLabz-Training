import java.util.Scanner;

public class FactorsOfNoUsingWhile
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();

	if(number > 0)
	{	
	    int strt = 1;
	    while(strt<=number)
	    {
	        if(number%strt == 0)
		{
		    System.out.println(strt);
		}
	        strt++;
	    }
	}
    }
}

