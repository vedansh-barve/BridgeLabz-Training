// Sandeep’s Fitness Challenge Tracker 🏋️
// Each day Sandeep completes a number of push-ups.
// Store counts for a week.
// Use for-each to calculate total and average.
// Use continue to skip rest days

import java.util.Scanner;

public class SandeepFitness
{
    public static void fitnessTracker()
    {
	Scanner input = new Scanner(System.in);
	int[] pushupCount = new int[7];
	int atIdx = 0;
	int total = 0;

	while(true)
	{
	    if(atIdx == pushupCount.length)
	    {
		System.out.println("------Sandeep Fitness Track for Week---------");
		System.out.println("Total Pushups count : " + total);
	        System.out.println("Average Pushup count: " + (total/7));
		System.out.println("-----------------------------------------------");
		break;
	    }

	    System.out.println("Enter Pushup Count for Day " + (atIdx+1) + ": ");
	    pushupCount[atIdx] = input.nextInt();
	    total += pushupCount[atIdx++];
	}
    }

    public static void main(String args[])
    {
	fitnessTracker();
    }
}