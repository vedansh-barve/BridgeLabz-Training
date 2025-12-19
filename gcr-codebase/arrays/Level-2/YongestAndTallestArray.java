import java.util.Scanner;

public class YongestAndTallestArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int amarAge, akbarAge, antonyAge;
	int amarHeight, akbarHeight, antonyHeight;
	int[] age = new int[3];
	double[] height = new double[3];
	
	for(int i=0; i<3; i++)
	{
	    System.out.print("Enter Age: ");
	    age[i] = input.nextInt();
	    System.out.print("Enter Height: ");
	    height[i] = input.nextDouble();
	}	
	
	int youngest = 0;
	double tallest  = height[0];
	int tallIdx = 0;
	
	for(int i=1; i<3; i++)
	{
	    if(age[i] < age[youngest])
	        youngest = i;
	    if(height[i] > tallest)
       	    {
 		tallest = height[i];
  		tallIdx = i;
	    }
	}
	
	
	if(youngest == 0)
	{
	    System.out.println("Amar is youngest");
	}
	else if(youngest == 1)
	{
	    System.out.println("Akbar is youngest");
	}
	else if(youngest == 2)
	{
	    System.out.println("Antony is youngest");
	}
	
	//for height (Height in cm29
	if(tallIdx == 0)
	{
	    System.out.println("Amar is Tallest");
	}
	else if(tallIdx == 1)
	{
	    System.out.println("Akbar is Tallest");
	}
	else if(tallIdx == 2)
	{
	    System.out.println("Antony is Tallest");
	}
    }
}

