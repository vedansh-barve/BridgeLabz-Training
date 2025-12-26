import java.util.Scanner;

public class CanStudentsVote
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int[] studentsAge = new int[10];
	int size = studentsAge.length;
	
	for(int i=0; i<size; i++)
	{
	    System.out.print("Enter Student Age: ");
	    int age;
	    age = input.nextInt();
	    while(age < 0)
	    {
	    	System.out.print("Invalid Age, Enter again: ");
		age = input.nextInt();
	    }
	    studentsAge[i] = age;
	    if(studentsAge[i] >= 18)
	    {
	        System.out.println("The student with the age " + studentsAge[i] + " can vote");
	    }
	    else
	    	System.out.println("The student with the age " + studentsAge[i] + " cannot vote");
	    
	}
	input.close();
	
    }
}

