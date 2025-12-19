import java.util.Scanner;

public class TwoDimensionalArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int row, column;
	System.out.print("Enter No. of Rows: ");
	row = input.nextInt();
	System.out.print("Enter No. of Columns: ");
	column = input.nextInt();
	int[][] twoDArray = new int[row][column];
	
	System.out.print("Enter Array Elements: ");
	for(int i=0; i<row; i++)
	{
	    for(int j=0; j<column; j++)
	    {
		twoDArray[i][j] = input.nextInt();
	    }
	}
	
	int size = row*column;
	int[] arr = new int[size];
	int index = 0;
	
	for(int i=0; i<row; i++)
	{
	    for(int j=0; j<column; j++)
	    {
		arr[index++] = twoDArray[i][j];
	    }
	}
	System.out.print("Array Elements are: ");
	for(int i=0; i<size; i++)
	{
	    System.out.println(arr[i] + ", ");
	}
	
	input.close();
		
    }
}

