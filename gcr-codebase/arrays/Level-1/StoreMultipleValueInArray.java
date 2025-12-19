import java.util.Scanner;

public class StoreMultipleValueInArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double[] numbers = new double[10];
	int size = numbers.length;
	
	int index = 0;
	while(true)
	{
	    if(index > 9)
		break;
	
	    double number;
	    System.out.print("Enter Number: ");
	    number = input.nextDouble();

	    if(number <= 0)
	    	break;
	    
   	    numbers[index] = number;
	    index++;
	}
	
	double totalSum = 0.0;
	for(int i=0; i<size; i++)
	    totalSum += numbers[i];
	System.out.println("The total Value is: " + totalSum);
	System.out.println("Size is " + size);
			
	input.close();
    }
}

