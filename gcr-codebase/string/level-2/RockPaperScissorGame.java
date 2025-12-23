import java.util.Scanner;

public class RockPaperScissorGame
{
    public static String computerChoice()
    {	
	int random = (int)((Math.random() * 3)+1);	
    	if(random == 1) return "rock";
	else if(random == 2) return "paper";
	return "scissor";
    }	
	
    public static String[][] findWinner(String[] userChoice, String[] machineChoice, int rounds)
    {
	String[][] winner = new String[rounds][2];
	for(int i=0; i<rounds; i++)
	{
	    winner[i][0] = String.valueOf(i+1);
	    if(userChoice[i].equals(machineChoice[i]))
	   	winner[i][1] = "draw";
	    else if(userChoice[i].equals("rock") && machineChoice[i].equals("scissor"))
	    	winner[i][1] = "win"; 
	    else if(userChoice[i].equals("paper") && machineChoice[i].equals("rock"))
		winner[i][1] = "win"; 
	    else if(userChoice[i].equals("scissor") && machineChoice[i].equals("paper"))
		winner[i][1] = "win"; 
	    else 
		winner[i][1] = "loose"; 
	}
	return winner;
    }

    public static void displayResult(String[][] winner, int rounds)
    {	
	for(int i=0; i<rounds; i++)
	{
	    System.out.println("In round " + winner[i][0] + " you " + winner[i][1]);
	}
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int rounds;
	System.out.print("Enter the number of rounds: ");
	rounds = input.nextInt();
	
	System.out.println("Rock-1, Paper-2, Scisssor-3");
	String[] userChoice = new String[rounds];
	String[] machineChoice = new String[rounds];

	for(int i=0; i<rounds; i++)
	{	
	    machineChoice[i] = computerChoice();
	    int number;
	    System.out.print("Enter your choice: ");
	    number = input.nextInt();
	    if(number == 1) userChoice[i] = "rock";
	    else if(number == 2) userChoice[i] = "paper";
	    else userChoice[i] = "scissor";
	}
	String[][] winner = findWinner(userChoice, machineChoice, rounds);
	displayResult(winner, rounds);
		
	input.close();
	
    }
}
