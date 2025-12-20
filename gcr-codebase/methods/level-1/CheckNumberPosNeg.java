import java.util.Scanner;

public class CheckNumberPosNeg
{
    String calcDistance(int number)
    {
	if(number > 0)
	    return "Positive";
	else if(number < 0)
	    return "Negative";
	else
	    return "Zero";
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	CheckNumberPosNeg obj = new CheckNumberPosNeg();
	String result = obj.calcDistance(number);
	System.out.print("The Number is: " + result);
	
    }
}