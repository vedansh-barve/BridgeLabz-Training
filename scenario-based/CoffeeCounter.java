import java.util.Scanner;

public class CoffeeCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String coffeeType;

        // Continue serving customers
        while (true)
        {
            System.out.print("Enter coffee type (Espresso-139, Latte-199, Cappuccino-89, BlackCoffee-199) or 'exit' to stop: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit"))
            {
                System.out.println("Thank you for visiting");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double pricePerCup = 0;

            // Switch to determine coffee price
            switch (coffeeType)
            {
                case "espresso":
                    pricePerCup = 139;
                    break;

                case "latte":
                    pricePerCup = 199;
                    break;

                case "cappuccino":
                    pricePerCup = 89;
                    break;

	   	case "blackcoffee":
                    pricePerCup = 199;
                    break;

                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }

            double total = pricePerCup * quantity;
            double gst = total * 0.05;
            double finalBill = total + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Amount : " + total);
            System.out.println("GST (5%)    : " + gst);
            System.out.println("Total Bill  : " + finalBill);
        }

        sc.close();
    }
}
