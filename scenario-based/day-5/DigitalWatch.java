// Digital Watch Simulation ⏱️
// Simulate a 24-hour watch:
// Print hours and minutes in a nested for-loop.
// Use a break to stop at 13:00 manually (simulate power cut).
// Core Java Scenario Based Problem Statement

public class DigitalWatch
{
    public static void digitalWatchSimulation()
    {

	for(int hour=0; hour<24; hour++)
	{
	    for(int min=0; min<60; min++)
	    {
	        if(hour == 13 && min == 1)
		    break;
		if(hour < 10)
	     	{
		    if(min < 10)
			System.out.println("Time: 0" + hour + " : 0" + min);
		    else
			System.out.println("Time: 0" + hour + " : " + min);
	  	} 
		else
		{
		    if(min < 10)
			System.out.println("Time: " + hour + " : 0" + min);
		    else
			System.out.println("Time: " + hour + " : " + min);
		}  
	    }
	    if(hour == 13)
		break;
	}
    }

    public static void main(String args[])
    {
	digitalWatchSimulation();
    }
}