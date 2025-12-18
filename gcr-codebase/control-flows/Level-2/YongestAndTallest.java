import java.util.Scanner;

public class YongestAndTallest
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int amarAge, akbarAge, antonyAge;
	int amarHeight, akbarHeight, antonyHeight;
		
	System.out.print("Enter Age of Amar: ");
	amarAge = input.nextInt();
	System.out.print("Enter Age of Akbar: ");
	akbarAge = input.nextInt();
	System.out.print("Enter Age of Antony: ");
	antonyAge = input.nextInt();

	System.out.print("Enter Height of Amar in cm: ");
	amarHeight = input.nextInt();
	System.out.print("Enter Height of Akbar in cm: ");
	akbarHeight = input.nextInt();
	System.out.print("Enter Height of Antony in cm: ");
	antonyHeight = input.nextInt();

	if(amarAge < akbarAge && amarAge < antonyAge)
	{
	    System.out.println("Amar is youngest");
	}
	else if(akbarAge < amarAge && akbarAge < antonyAge)
	{
	    System.out.println("Akbar is youngest");
	}
	else if(antonyAge < amarAge && antonyAge < akbarAge)
	{
	    System.out.println("Antony is youngest");
	}
	
	//for height (Height in cm)
	if(amarAge > akbarAge && amarAge > antonyAge)
	{
	    System.out.println("Amar is Tallest");
	}
	else if(akbarAge > amarAge && akbarAge > antonyAge)
	{
	    System.out.println("Akbar is Tallest");
	}
	else if(antonyAge > amarAge && antonyAge > akbarAge)
	{
	    System.out.println("Antony is Tallest");
	}
    }
}

