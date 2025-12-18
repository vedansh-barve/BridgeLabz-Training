import java.util.Scanner;

public class SpringSeason
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	String month;
	int day;
	month = input.next();
	day = input.nextInt();

	if((month.equals("march") && day >= 20 && day <= 31) || (month.equals("april") && day >= 1 && day <= 30) 	|| (month.equals("may") && day >= 1 && day <= 31) || (month.equals("june") && day >= 1 && day <= 20))
	{
	    System.out.println("Its a Spring Season");
	}	
	else
	{
	    System.out.println("Not a Spring Season");
	}
	
    }
}

