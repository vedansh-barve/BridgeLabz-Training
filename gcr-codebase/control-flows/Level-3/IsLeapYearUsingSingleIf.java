import java.util.Scanner;

public class IsLeapYearUsingSingleIf
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int year;
	System.out.print("Enter Year: ");
	year = input.nextInt();
	
	if((year >= 1582 && year <= 2025) && (year%400 == 0 || (year % 4 == 0 && year % 100 != 0)))
	{	
	    	System.out.println("Leap Year");
	}
	else
	{
	    System.out.println("Not a Leap Year or not a valid leap year condition");
	}
    }
}

