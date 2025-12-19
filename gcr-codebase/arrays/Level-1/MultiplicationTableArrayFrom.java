import java.util.Scanner;

public class MultiplicationTableArrayFrom
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int[] table = new int[10];
	int size = table.length;
	
	if(number >= 6 && number <= 9)
	{
	    for(int strt = 1; strt <= 10; strt++)
	        table[strt-1] = (number*strt);
	    for(int strt = 1; strt <= 10; strt++)
		System.out.println(number + " * " + strt + " = " + table[strt-1]);	    
	}	
	else
	{
	    System.out.println("Not a Valid Number");
	}
    }
}

