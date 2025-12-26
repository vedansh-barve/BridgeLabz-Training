import java.util.Scanner;

public class CalcTotalPrice
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);	
	int unitPrice;
	int quantity;
	System.out.print("Enter unit price: ");
	unitPrice = input.nextInt();
	System.out.print("Enter quantity: ");
	quantity = input.nextInt();
	int totalPrice = unitPrice*quantity;
	
	System.out.print("The total purchase price is INR" + totalPrice + " if the quantity "+ quantity +"and unit price is INR" + unitPrice);

    }
}