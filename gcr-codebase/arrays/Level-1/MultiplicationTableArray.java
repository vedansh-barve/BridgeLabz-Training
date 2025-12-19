import java.util.Scanner;

public class MultiplicationTableArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int[] tableValues = new int[10];
	int size = tableValues.length;
	
	for(int strt = 1; strt <= size; strt++)
	{
	    tableValues[strt-1] = number*strt;
	}
	for(int strt = 1; strt <= size; strt++)
	{
	    System.out.println(number + " * " + strt + " = " + tableValues[strt-1]);
	}
		
	input.close();
    }
}

