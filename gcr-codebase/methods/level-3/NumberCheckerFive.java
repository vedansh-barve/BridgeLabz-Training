import java.util.Scanner;

public class NumberCheckerFive {

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temporaryNumber = number;

        int factorial[] = new int[10];
        factorial[0] = 1;
        for (int i = 1; i < 10; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        while (temporaryNumber > 0) {
            int digit = temporaryNumber % 10;
            temporaryNumber /= 10;

            sum += factorial[digit];
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter Number:");
        int number = input.nextInt();
        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}