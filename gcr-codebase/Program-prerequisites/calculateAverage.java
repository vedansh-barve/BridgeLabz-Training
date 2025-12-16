import java.util.Scanner;

public class CalculateAverage {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int value1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int value2 = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int value3 = sc.nextInt();

        int sum = value1 + value2 + value3;

        System.out.println("Average of Three number is: " + (sum/3));
    }
}
