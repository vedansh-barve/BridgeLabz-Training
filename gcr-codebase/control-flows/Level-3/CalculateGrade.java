import java.util.Scanner;

public class CalculateGrade
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int physicsMarks, chemistryMarks, mathsMarks;
	System.out.print("Enter Physics Marks: ");
	physicsMarks = input.nextInt();
	System.out.print("Enter Chemistry Marks: ");
	chemistryMarks = input.nextInt();
	System.out.print("Enter Maths Marks: ");
	mathsMarks = input.nextInt();

	int sum = physicsMarks + chemistryMarks + mathsMarks;
	int marksPercent = (sum*100) / 300;
	
	if(marksPercent >= 80 && marksPercent <= 100)
	{	
	    	System.out.println("Grade A ");
		System.out.println("Level 4, above agency-normalised standards");
	}
	else if(marksPercent >= 70 && marksPercent <= 79)
	{	
	    	System.out.println("Grade B ");
		System.out.println("Level 3, at agency-normalised standards");
	}
	else if(marksPercent >= 60 && marksPercent <= 69)
	{	
	    	System.out.println("Grade C ");
		System.out.println("Level 2, below but approaching agency-normalised standards");
	}
	else if(marksPercent >= 50 && marksPercent <= 59)
	{	
	    	System.out.println("Grade D ");
		System.out.println("Level 1, well below agency-normalised standards");
	}
	else if(marksPercent >= 40 && marksPercent <= 49)
	{	
	    	System.out.println("Grade E ");
		System.out.println("Level 1-, too below agency-normalised standards");
	}
	else if(marksPercent <= 39 && marksPercent >= 0)
	{	
	    	System.out.println("Grade R ");
		System.out.println("Remedial Standards");
	}
    }
}

