import java.util.Scanner;

public class ParkingLot
{
    public static void startGame(int[] noOfParking)
    {
	Scanner input = new Scanner(System.in);
	int idx = 0;
	while(true)
	{
	    if(idx == noOfParking.length)
	    {
		System.out.println("Parking Slot is Full");
		break;
  	    }
		
	    int userChoice;
	    System.out.println("Enter Choice: (Park-> 1, Show-occupancy-> 0, Exit-> -1)");
	    userChoice = input.nextInt();
	    while(userChoice < -1 &&  userChoice > 1)
	    {
		System.out.println("Inavlid Choice, Enter Again---");
		System.out.println("Enter Choice: (Park-> 1, Show-occupancy-> 0, Exit-> -1)");
		userChoice = input.nextInt();
  	    }
	
	    if(userChoice == -1)
	    {
		System.out.println("Thank you----");
		break;
	    }

	    switch(userChoice)
	    {
		case 0:
		    System.out.println("Current Occupancy is: " + idx);
		    break;
		case 1:
		    System.out.println("Your Car is Successfully Parked At: " + idx++);
		    break;
	    }
	}
	input.close();
    }

    public static void main(String args[])
    {
    	int[] noOfParking = new int[10];
	startGame(noOfParking);
    }
}