import java.util.Scanner;

public class CountDownRocket
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	number = input.nextInt();

	while(number >= 1)
	{
	System.out.println(number);
	number--;
	}	
    }
}

