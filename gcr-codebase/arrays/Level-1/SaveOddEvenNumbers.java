import java.util.Scanner;

public class SaveOddEvenNumbers
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	if(number <= 0)
	{
	    System.out.print("Not a Natural number");
	}	
	else
	{
	    int oddSize, evenSize;
	    if(number % 2 == 0)
	    {
	        oddSize = (number/2);
	        evenSize = number - oddSize;
	    }
	    else
	    {
		oddSize = (number/2) + 1;
	        evenSize = number - oddSize;
	    }
	    int[] even = new int[evenSize];
	    int[] odd = new int[oddSize];
	    int evenIndex = 0, oddIndex = 0;

	    for(int strt = 1; strt <= number; strt++)
	    {
	        if(strt%2 == 0)
		    even[evenIndex++] = strt;
		else
		    odd[oddIndex++] = strt;
	    }
	    //printing even array
	    System.out.print("Even Array : ");
	    for(int i=0; i < evenSize; i++)
	    {
	        System.out.print(even[i] + ", ");
	    }
	    System.out.println("  ");
	    //printing odd array
	    System.out.print("Odd Array : ");
	    for(int i=0; i < oddIndex; i++)
	    {
	        System.out.print(odd[i] + ", ");
	    }
	}
	
	input.close();
		
    }
}

