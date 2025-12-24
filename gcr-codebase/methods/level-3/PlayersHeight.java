public class PlayersHeight {

    public int[] getRandomArray(int startRange, int endRange, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {

            array[i] = (int) (Math.random() * (endRange - startRange)) + startRange;
        }
        return array;
    }

    public int getArrayMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            min = Math.min(min, number);
        }
        return min;
    }

    public int getArraySum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public int getArrayMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            max = Math.max(max, number);
        }
        return max;
    }

    public double getMean(int[] array) {
        double sum = getArraySum(array);
        double mean = sum / array.length;
        return mean;
    }

    public static void main(String[] args) {
        PlayersHeight heightCalculator = new PlayersHeight();

        int[] heights = heightCalculator.getRandomArray(150, 250, 11);

        System.out.println("Generated heights (cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = heightCalculator.getArraySum(heights);
        int min = heightCalculator.getArrayMin(heights);
        int max = heightCalculator.getArrayMax(heights);
        double mean = heightCalculator.getMean(heights);

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Shortest player height: " + min + " cm");
        System.out.println("Tallest player height: " + max + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
    }
}