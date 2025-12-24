
import java.util.Scanner;

public class NumberCheckerTwo {

    public static int getDigitCount(int number) {
        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    public static int[] getDigitArray(int number) {
        int countDigits = getDigitCount(number);
        int[] digits = new int[countDigits];
        for (int counter = countDigits - 1; counter >= 0; counter--) {
            digits[counter] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int getArraySum(int[] digits) {
        int arraySum = 0;

        for (int digit : digits) {
            arraySum += digit;
        }

        return arraySum;
    }

    public static int getSquareArraySum(int[] digits) {
        int arraySum = 0;

        for (int digit : digits) {
            arraySum += Math.pow(digit, 2);
        }

        return arraySum;
    }

    public static boolean isHarshadNumber(int[] digits) {
        int digitSum = 0;
        int originalNumber = 0;

        for (int digit : digits) {
            digitSum += digit;
            originalNumber = originalNumber * 10 + digit;
        }

        if (originalNumber % digitSum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[][] getFrequency(int number) {
        int[] digits = getDigitArray(number);
        int[][] frequency = new int[2][10];

        for (int counter = 0; counter < 10; counter++) {
            frequency[0][counter] = counter;
        }

        for (int digit : digits) {
            frequency[1][digit]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :");
        int number = input.nextInt();

        int[] digits = getDigitArray(number);
        int sum = getArraySum(digits);
        int squareSum = getSquareArraySum(digits);

        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Is Harshad Number: " + isHarshadNumber(digits));

        int[][] frequency = getFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + frequency[0][i] + " -> " + frequency[1][i]);
        }
    }
}