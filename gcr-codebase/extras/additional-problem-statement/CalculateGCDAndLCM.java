import java.util.Scanner;

public class CalculateGCDAndLCM
{
    public static int[] takeInput()
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();
	System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();

        return numbers;
    }

    public static int calculateGCD(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b)
    {
        return (a * b) / calculateGCD(a, b);
    }

    public static void displayResult(int a, int b, int gcd, int lcm)
    {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String args[])
    {
        int[] numbers = takeInput();
        int a = numbers[0];
        int b = numbers[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);
        displayResult(a, b, gcd, lcm);
    }
}
