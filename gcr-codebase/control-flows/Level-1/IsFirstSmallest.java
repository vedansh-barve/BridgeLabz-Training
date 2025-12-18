import java.util.Scanner;

public class IsFirstSmallest
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number1, number2, number3;
	number1 = input.nextInt();
	number2 = input.nextInt();
	number3 = input.nextInt();

	if(number1 < number2 && number1 < number3)
	{
	System.out.print("Is the first number the smallest? Yes.");
	}	
	else
	{
	System.out.print("Is the first number the smallest? No.");
	}
    }
}

