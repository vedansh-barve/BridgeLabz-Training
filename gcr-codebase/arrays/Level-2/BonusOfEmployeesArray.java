import java.util.Scanner;

public class BonusOfEmployeesArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double[] oldSalary = new double[10];
	double[] yearOfService = new double[10];
	
	double[] newSalary = new double[10];
	double[] bonusAmount = new double[10];
		
	for(int i=0; i<10; i++)
	{
	    System.out.print("Enter Salary of employee " + (i+1) + ": ");
	    int salary;
	    salary = input.nextInt();
	    while(salary < 0)
	    {
	    	System.out.print("Invalid Salary, Enter again: ");
		salary = input.nextInt();
	    }	  
	    // for years of experience
	    System.out.print("Enter Years of experience of employee " + (i+1) + ": ");
	    int years;
	    years = input.nextInt();
	    while(years <= 0)
	    {
	    	System.out.print("Invalid Year, Enter again: ");
		years = input.nextInt();
	    }	  

	    oldSalary[i] = salary;
	    yearOfService[i] = years;
	}
	
	for(int i=0; i<10; i++)
	{
	    if(yearOfService[i] >= 5) // 5% bonus
	    {
	        double bonus = (oldSalary[i]*5)/100;
	   	newSalary[i] = oldSalary[i] + bonus;
		bonusAmount[i] = bonus;
	    }
	    else if(yearOfService[i] < 5)  // 2% bonus
	    {
	        double bonus = (oldSalary[i]*2)/100;
	   	newSalary[i] = oldSalary[i] + bonus;
		bonusAmount[i] = bonus;
	    }
	}
	
	for(int i=0; i<10; i++)
	{
	    System.out.println("The total bonus of employee " + (i+1) + " is " + bonusAmount[i]);
	    System.out.println("The old salary of employee " + (i+1) + " is " + oldSalary[i]);
	    System.out.println("The new salary of employee " + (i+1) + " is " + newSalary[i]);
	    System.out.println(" ");
	}
    }
}

