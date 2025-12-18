import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number, power;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	System.out.print("Enter Power: ");
	power = input.nextInt();
	int result = 1;
	
	for(int strt = 1; strt <= power; strt++)
	{
	    result *= number;
	}
	System.out.println(result);
    }
}

