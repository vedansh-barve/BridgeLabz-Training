import java.util.Scanner;

public class IntOperation
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);	
	int a, b, c;
	a = input.nextInt();	
	b = input.nextInt();	
	c = input.nextInt();	

	int opt1 = a + b *c;
	int opt2 = a * b + c;
	int opt3 = c + a / b;
	int opt4 = a % b + c;
	
	System.out.print("The results of Int Operations are "+ opt1 + ", " + opt2 + ", " + opt3 + " and" + opt4);

    }
}