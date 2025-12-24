import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PercentageGrading {

    public int[][] getRandomArray(int size) {
        int startRange = 10;
        int endRange = 100;
        int[][] scores = new int[3][size];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                scores[i][j] = ThreadLocalRandom.current().nextInt(startRange, endRange + 1);
            }
        }
        return scores;
    }

    public int[][] getSumAndPercentage(int[][] scores) {
        int numberOfStudents = scores[0].length;
        int[][] results = new int[2][numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            int sum = scores[0][i] + scores[1][i] + scores[2][i];
            results[0][i] = sum;
            results[1][i] = (int) Math.round((double) sum / 300 * 100);
        }
        return results;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            PercentageGrading object = new PercentageGrading();

            System.out.print("Enter the number of students: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer for the number of students.");
                return;
            }
            int numberOfStudents = input.nextInt();

            if (numberOfStudents <= 0) {
                System.out.println("Number of students must be positive.");
                return;
            }

            int[][] scores = object.getRandomArray(numberOfStudents);
            int[][] results = object.getSumAndPercentage(scores);

            System.out.println("\nResults Summary:");
            System.out.println("S.No\tSub1\tSub2\tSub3\tTotal\tPercent");

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.printf(
                        "%d\t%d\t%d\t%d\t%d\t%d%%\n",
                        i + 1,
                        scores[0][i],
                        scores[1][i],
                        scores[2][i],
                        results[0][i],
                        results[1][i]);
            }
        }
    }
}