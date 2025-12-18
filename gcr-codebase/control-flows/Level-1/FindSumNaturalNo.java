import java.util.Scanner;

public class FindSumNaturalNo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	number = input.nextInt();
	int originalNo = number;

	if(number > 0)
	{
	int sumUsingFormula =  number * (number+1) / 2;
	int sumUsingLoop = 0;
	while(number > 0)
	{	
	    sumUsingLoop += number;
	    number--;
	}
	System.out.println("The sum of " + originalNo + " natural numbers using formula is " + sumUsingFormula);
	System.out.println("The sum of " + originalNo + " natural numbers using loop is " + sumUsingLoop);
	}	
	else
	{
	System.out.print("The number " + number + " is not a natural number");
	}
    }
}

