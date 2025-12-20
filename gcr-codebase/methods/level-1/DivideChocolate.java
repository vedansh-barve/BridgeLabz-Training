import java.util.Scanner;

public class DivideChocolate
{
    public static int[] findNoOfChocolate(int noOfChildren, int noOfChocolate)
    {
	int eachChildrenGet = noOfChocolate / noOfChildren;
	int remainingChocolate = noOfChocolate % noOfChildren;
	
	int[] resultArr = new int[2];
	resultArr[0] = eachChildrenGet;
	resultArr[1] = remainingChocolate;
	return resultArr;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int noOfChildren, noOfChocolate;
	System.out.print("Enter Number of Children: ");
	noOfChildren = input.nextInt();
	System.out.print("Enter Number of Chocolates: ");
	noOfChocolate = input.nextInt();
	int[] resultArr = findNoOfChocolate(noOfChildren, noOfChocolate);
	System.out.println("Each Children will get: " + resultArr[0]);
	System.out.print("Remaining Chocolates: " + resultArr[1]);
	
    }
}