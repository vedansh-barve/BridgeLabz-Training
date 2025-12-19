import java.util.Scanner;
import java.util.Arrays;

public class FactorsOfNumberArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	int maxFactor = 10;
	int[] factorArr = new int[maxFactor];
	int index = 0;

	if(number > 0)
	{	
	    for(int strt=1; strt<=number; strt++)
	    {
	        if(number%strt == 0)
		{
		    if(index == maxFactor)
		    {
		        maxFactor = maxFactor * 2;
                        factorArr = Arrays.copyOf(factorArr, maxFactor);
		    }
		    factorArr[index++] = strt;
		}
	    }
	    for(int i=0; i<index; i++)
	    {
	        System.out.print(factorArr[i] + ", ");
	    }
	}
    }
}

