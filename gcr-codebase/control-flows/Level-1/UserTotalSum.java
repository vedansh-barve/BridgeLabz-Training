import java.util.Scanner;

public class UserTotalSum
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double total = 0.0;
	double userValue;
	System.out.print("Enter value: ");
	userValue = input.nextDouble();
	
	while(userValue != 0)
	{
	total += userValue;
	System.out.print("Enter value: ");
	userValue = input.nextDouble();
	}	
	System.out.println("Total Sum: " + total);
    }
}

