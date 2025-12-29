// School Bus Attendance System 🚍
// Track 10 students' presence.
// Use for-each loop on names.
// Ask "Present or Absent?"
// Print total present and absent counts.

import java.util.Scanner;

public class SchoolBusAttendance
{
    public static void takeAttendance()
    {
	Scanner input = new Scanner(System.in);
	boolean[] studentsPresent = new boolean[10];

	for(int i=0; i<10; i++)
	{
	    String user;
	    System.out.print("Mark Attendance for Student " + (i+1) +  ": (Present / Absent): ");
	    user = input.next();
	    while((!user.toLowerCase().equals("present")) && (!user.toLowerCase().equals("absent")))
	    {
		System.out.print("Invalid Input, Mark Attendance: (Present / Absent): ");
	    	user = input.next();
	    }
	
	    if(user.toLowerCase().equals("present"))
		studentsPresent[i] = true;
	    else
		studentsPresent[i] = false;
	}

	int totalPresent = 0;
	int totalAbsent = 0;

	for(boolean i: studentsPresent)
	{
	    if(i) totalPresent++;
	    else totalAbsent++;
	}

	System.out.println("Total Present: " + totalPresent);
	System.out.println("Total Absent: " + totalAbsent);
    }

    public static void main(String args[])
    {
	takeAttendance();
    }
}