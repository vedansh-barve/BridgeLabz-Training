public class BonusCalculator {

    public double[] getRandomArray(int startRange, int endRange, int size) {
        endRange++;
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            int randomValue = (int) ((endRange - startRange) * Math.random() + startRange);
            array[i] = randomValue;
        }

        return array;
    }

    public double[][] getNewSalaryAndBonus(double[] salary, double[] yearsOfService) // Corrected method name
    {
        int size = Math.min(salary.length, yearsOfService.length);
        double[][] newSalaryAndBonus = new double[2][size];

        for (int i = 0; i < size; i++) {
            double bonus;
            if (yearsOfService[i] < 5) {
                bonus = salary[i] * .02;
            } else {
                bonus = salary[i] * .05;
            }

            newSalaryAndBonus[0][i] = salary[i] + bonus; // Changed 'j' to 'i'
            newSalaryAndBonus[1][i] = bonus;
        }
        return newSalaryAndBonus;
    }

    public double getArraySum(double[] array)

    {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        BonusCalculator object = new BonusCalculator();

        double[] salary = object.getRandomArray(10000, 99999, 10);
        double[] yearsOfService = object.getRandomArray(0, 10, 10);
        double[][] newSalaryAndBonus = object.getNewSalaryAndBonus(salary, yearsOfService); // Corrected method call

        System.out.printf("| %9s | %9s | %9s | %9s |%n", "salary", "YearofSer", "newSalary", "bonus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("| %9.2f | %9.0f | %9.2f | %9.2f |%n", salary[i], yearsOfService[i],
                    newSalaryAndBonus[0][i], newSalaryAndBonus[1][i]);
        }

        System.out.println("Total old salary is " + object.getArraySum(salary));
        System.out.println("Total new salary is " + object.getArraySum(newSalaryAndBonus[0]));
        System.out.println("Total bonus is " + object.getArraySum(newSalaryAndBonus[1])); // Completed the print
                                                                                          // statement and added total
                                                                                          // bonus
    }
}