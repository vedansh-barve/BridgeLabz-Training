import java.util.Scanner;

public class FindSumUntilUser
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double total = 0.0;
	double userValue;
	System.out.print("Enter value: ");
	userValue = input.nextDouble();
	
	while(true)
	{
	if(userValue <= 0)
		break;
	total += userValue;
	System.out.print("Enter value: ");
	userValue = input.nextDouble();
	}	
	System.out.println("Total Sum: " + total);
    }
}

