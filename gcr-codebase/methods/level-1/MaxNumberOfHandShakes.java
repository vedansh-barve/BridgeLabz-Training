import java.util.Scanner;

public class MaxNumberOfHandShakes
{
    int combinationHandshakes(int noOfStudents)
    {
	int combination = (noOfStudents * (noOfStudents - 1)) / 2;
	return combination;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int noOfStudents;
	System.out.print("Enter Number of Students : ");
	noOfStudents = input.nextInt();

	MaxNumberOfHandShakes obj = new MaxNumberOfHandShakes();
	int result = obj.combinationHandshakes(noOfStudents);
	System.out.print("The number of possible handshakes are " + result);
	
    }
}