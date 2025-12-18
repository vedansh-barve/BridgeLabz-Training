import java.util.Scanner;

public class PowerOfNumberUsingWhile
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
	
	int strt = 1;
	while(strt <= power)
	{
	    result *= number;
	    strt++;
	}
	System.out.println(result);
    }
}

