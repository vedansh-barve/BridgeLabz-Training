import java.util.Scanner;

public class CountDownRocketForLoop
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	number = input.nextInt();

	for(int strt=number; strt >= 1; strt--)
	{
	System.out.println(strt);
	}	
    }
}

