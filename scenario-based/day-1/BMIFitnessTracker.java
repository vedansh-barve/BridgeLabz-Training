import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in meter: ");
        double heightInMeters = scanner.nextDouble();

        System.out.print("Enter weight in kg: ");
        double weightInKg = scanner.nextDouble();

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }
        scanner.close();
    }
}
