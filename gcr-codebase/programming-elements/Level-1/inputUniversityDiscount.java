import java.util.Scanner;

public class inputUniversityDiscount
{
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
        int totalFee;
	int discount;
	
	System.out.print("Enter the University fee: ");
	totalFee = input.nextInt();
	System.out.print("Enter the University discount in percent: ");
	discount = input.nextInt();
	
	discount = ((totalFee*10)/100);
	int discountPrice = totalFee - discount;
	System.out.print("The discount amount is INR "+ discount + " and final discounted fee is INR " + discountPrice);
    }
}