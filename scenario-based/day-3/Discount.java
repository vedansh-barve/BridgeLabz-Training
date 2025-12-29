// Shopkeeper’s Discount Dashboard 🛍️
// A shopkeeper gives discounts based on total bill:
// Input item prices in a for-loop.
// Use if-else for discount logic.
// Use proper indentation, constants, and comments.

import java.util.Scanner;

public class Discount
{
    public static void provideDiscount()
    {
	Scanner input = new Scanner(System.in);
	long totalAmount = 0;
	for(int i=0; true; i++)
	{	
	    long price;
	    System.out.print("Enter Item price: (-1 for exit): ");
	    price = input.nextInt();
	    while(price < -1 || price == 0)
	    {
		System.out.print("Invalid price, Enter Item price again: (-1 for exit): ");
		price = input.nextInt();
	    }
	    //calculate total bill
	    if(price == -1)
	    {
	        System.out.println("-------------------------------------");
		System.out.println("Your Total amount is: " + totalAmount);
		long discount = (totalAmount * 10) / 100;
		System.out.println("Discount: " + discount);
		System.out.println("Amount to pay: " + (totalAmount-discount));
		System.out.println("-------------------------------------");
		break;
  	    }	
	    totalAmount += price;
	}
	input.close();
    }

    public static void main(String args[])
    {
	provideDiscount();
    }
}