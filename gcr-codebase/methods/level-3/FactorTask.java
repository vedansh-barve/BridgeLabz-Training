import java.util.Scanner;

public class FactorTask {
    public static int[] getFactorArray(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static double getArrayCubeProduct(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static long getArrayProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int getArraySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter Number:");
        int number = input.nextInt();
        int[] factors = getFactorArray(number);
        System.out.println("Greatest Factor: " + getMax(factors));
        System.out.println("Sum of Factors: " + getArraySum(factors));
        System.out.println("Product of Factors: " + getArrayProduct(factors));
        System.out.println("Product of Cube of Factors: " + getArrayCubeProduct(factors));
    }
}