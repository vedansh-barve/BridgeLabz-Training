import java.util.Scanner;

public class PossibleHandshakes
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);	
	int noOfStudents;
	noOfStudents = input.nextInt();
	int combinations = (noOfStudents * (noOfStudents - 1)) / 2;
		
	System.out.print("the number of possible handshakes: " + combinations);

    }
}