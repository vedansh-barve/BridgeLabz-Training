import java.util.Scanner;

public class NumberCheckerOne {
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[] { largest, secondLargest };
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Changed NumberChecker to NumberCheckerOne
        int digitCount = NumberCheckerOne.countDigits(number);
        int[] digits = NumberCheckerOne.getDigitsArray(number);

        System.out.println("Digit Count: " + digitCount);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println("\nIs Duck Number: " + NumberCheckerOne.isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + NumberCheckerOne.isArmstrongNumber(number, digits));

        int[] large = NumberCheckerOne.largestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + large[0]);
        System.out.println("Second Largest Digit: " + large[1]);

        int[] small = NumberCheckerOne.smallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + small[0]);
        System.out.println("Second Smallest Digit: " + small[1]);

        sc.close();
    }
}