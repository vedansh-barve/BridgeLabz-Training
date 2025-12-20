import java.util.Scanner;

public class SimpleInterest
{
    int findInterest(int principal, int rate, int time)
    {
	int simInterest = (principal * rate * time) / 100;
	return simInterest;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int principal, rate, time;
	System.out.print("Enter Pricipal : ");
	principal = input.nextInt();
	System.out.print("Enter Rate : ");
	rate = input.nextInt();
	System.out.print("Enter Time : ");
	time = input.nextInt();
	SimpleInterest obj = new SimpleInterest();
	int result = obj.findInterest(principal, rate, time);
	System.out.print("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	
    }
}