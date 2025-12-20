import java.util.Scanner;

public class SpringSeasonMethods
{
    boolean isSpring(String month, int day)
    {
	if(((month.equals("march") || month.equals("March")) && day >= 20 && day <= 31) || ((month.equals("april") || month.equals("April")) && day >= 1 && day <= 30) 	|| ((month.equals("may") || month.equals("May")) && day >= 1 && day <= 31) || ((month.equals("june") || month.equals("June")) && day >= 1 && day <= 20))
	{
	    return true;
	}	
	return false;	
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	String month;
	int day;
	System.out.print("Enter Month: ");
	month = input.next();
	System.out.print("Enter Day: ");
	day = input.nextInt();

	SpringSeasonMethods obj = new SpringSeasonMethods();
	boolean result = obj.isSpring(month, day);
	if(result) System.out.println("Its a Spring Season");
	else System.out.println("Not a Spring Season");
    }
}
