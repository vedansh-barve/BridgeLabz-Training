import java.util.Scanner;

public class BonusOfEmployees
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double salary, yearOfService;
	System.out.print("Enter Salary: ");
	salary = input.nextDouble();
	System.out.print("Enter Years of Service: ");
	yearOfService = input.nextInt();
	
	if(yearOfService > 5)
	{
	    double bonus = (salary*5)/100;
	    System.out.println("The bonus of employee is: " + bonus);
	}
	else
	{
	     System.out.println("Employee Years of Service is less than 5 year's. So, no bonus");
	}
    }
}

