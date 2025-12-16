import java.util.Scanner;

public class ConvertKilometerToMiles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Kilometer: ");
        int kilometer = sc.nextInt();

        double miles = kilometer * (0.621371);
        System.out.println("Miles is: " + miles);
    }
}
