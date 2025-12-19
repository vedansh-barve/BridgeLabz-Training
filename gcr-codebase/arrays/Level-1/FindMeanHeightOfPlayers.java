import java.util.Scanner;

public class FindMeanHeightOfPlayers
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	double[] table = new double[11];
	int size = table.length;
	double totalSumOfHeight = 0.0;
	for(int strt = 0; strt < size; strt++)
	{
	    System.out.print("Enter Height of Player " + (strt+1) + ": ");
	    table[strt] = input.nextDouble();	
	    totalSumOfHeight += table[strt];    
	}
		
	double mean = totalSumOfHeight/11.0;
	System.out.println(" The mean height of the football team is: " + mean);
	
	input.close();
		
    }
}

