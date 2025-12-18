import java.util.Scanner;

public class IsNumberDivisible
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	number = input.nextInt();
	if(number%5 == 0)
	{
	System.out.print("Is the number " + number + " divisible by 5? " + " Yes.");
	}	
	else
	{
	System.out.print("Is the number " + number + " divisible by 5? " + " No.");
	}
    }
}

