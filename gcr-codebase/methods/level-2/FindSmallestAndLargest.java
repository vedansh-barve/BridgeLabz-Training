import java.util.Scanner;

public class FindSmallestAndLargest
{
    public static int[] findSmallestAndLargest(int[] numbers)
    {
	int size = numbers.length;
	if(size == 0) return new int[]{0, 0};
	int largest = numbers[0];
	int smallest = numbers[0];
	int[] resultArr = new int[2];
	for(int i=1; i<size ; i++)
	{
	    if(numbers[i] > largest)
		largest = numbers[i];
	    if(numbers[i] < smallest)
		smallest = numbers[i];
	}
	resultArr[0] = largest;	
	resultArr[1] = smallest;
	return resultArr;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int[] arr = new int[3];
	for(int i=0; i<3; i++)
	{
	    System.out.print("Enter Number: ");
	    arr[i] = input.nextInt();
	}
	int[] resultArr = findSmallestAndLargest(arr);
	System.out.println("Largest number is: " + resultArr[0]);
	System.out.print("Smallest number is: " + resultArr[1]);
	
    }
}