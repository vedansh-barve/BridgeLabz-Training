// Movie Ticket Booking App 🎬
// Ask users for movie type, seat type (gold/silver), and snacks.
// Use switch and if together.
// Loop through multiple customers.
// Clean structure and helpful variable names

import java.util.Scanner;

public class MovieTicket
{
    public static void bookMovieTicket()
    {
	Scanner sc = new Scanner(System.in);
        boolean continueBooking = true;

        while (continueBooking) {

            int basePrice = 0;
            int snackPrice = 0;

            // Movie type selection
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("Enter choice: ");
            int movieType = sc.nextInt();

            // switch for movie type
            switch (movieType) {
                case 1:
                    basePrice = 200;
                    break;
                case 2:
                    basePrice = 180;
                    break;
                case 3:
                    basePrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type!");
                    continue;
            }

            // Seat type 
            System.out.print("Enter Seat Type (gold/silver): ");
            String seatType = sc.next();

            // if for seat type
            if (seatType.equalsIgnoreCase("gold")) {
                basePrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                basePrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks 
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            // if snacks
            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            int totalAmount = basePrice + snackPrice;

            // Display bill
            System.out.println("\n----- Booking Summary -----");
            System.out.println("Movie Type Price: " + basePrice);
            System.out.println("Snacks Price: " + snackPrice);
            System.out.println("Total Amount: " + totalAmount);

            // Continue or stop
            System.out.print("\nBook another ticket? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueBooking = false;
            }
        }

        System.out.println("\nThank you for using Movie Ticket Booking App 🎬");
        sc.close();
    }
    

    public static void main(String args[])
    {
	bookMovieTicket();
    }
}