import java.util.Scanner;

public class IsNumberPosNegZero
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	number = input.nextInt();

	if(number > 0)
	{
	System.out.print("Positive");
	}	
	else if(number < 0)
	{
	System.out.print("Negative");
	}
	else
	{
	System.out.print("Zero");
	}
    }
}

