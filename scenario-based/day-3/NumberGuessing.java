import java.util.Scanner;

public class NumberGuessing
{
    public static void startGame()
    {
	Scanner input = new Scanner(System.in);
	int myChoice = 77;
	int wrongAttempts = 0;
	while(true)
	{
	    int userChoice;
	    System.out.print("Guess Number: (between 1 to 100): ");
	    userChoice = input.nextInt();
	    boolean won = true;
	    do{
		if(wrongAttempts >= 5)
	   	{
		    won = false;
		    break;
		}	
	
		if(userChoice > myChoice)
		{
		    wrongAttempts++;
		    System.out.println("Too High, Enter Again: ");
		    userChoice = input.nextInt();
		}
		else
		{
	  	    wrongAttempts++;
		    System.out.println("Too Low, Enter Again: ");
		    userChoice = input.nextInt();
		}
	    }while(myChoice != userChoice);

	    if(won)
	    {
		System.out.println("You Won----------"); 
		break;  
	    }	
	    else
	    {
	    	System.out.println("You Failed, 5 Wrong Attempts");
		break;
	    }		     

	};
    }

    public static void main(String args[])
    {
        startGame();
    }
}