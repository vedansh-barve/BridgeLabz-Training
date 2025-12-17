public class discountedPrice
{
    public static void main(String args[])
    {
        int totalFee = 125000;
	int discount = ((totalFee *10) /100);
	int discountPrice = totalFee - discount;
	System.out.print("The discount amount is INR "+ discount + " and final discounted fee is INR " + discountPrice);
    }
}