import java.util.Scanner;

public class QuotientAndRemainder
{
    public static int[] findQuotientAndRemainder(int number1, int number2)
    {
	
	int[] resultArr = new int[2];
	int quotient, remainder;
	if(number2 != 0)
	{
	    quotient = number1/number2;
	}
	else
	    quotient = 0;
	remainder = number1%number2;
	resultArr[0] = quotient;
	resultArr[1] = remainder;
	return resultArr;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int number1, number2;
	System.out.print("Enter Number 1: ");
	number1 = input.nextInt();
	System.out.print("Enter Number 2: ");
	number2 = input.nextInt();
	int[] resultArr = findQuotientAndRemainder(number1, number2);
	System.out.println("Quotient is: " + resultArr[0]);
	System.out.print("Remainder is: " + resultArr[1]);
	
    }
}