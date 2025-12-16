import java.util.Scanner;

public class PowerCalculation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base value: ");
        int base = sc.nextInt();

        System.out.println("Enter exponent value: ");
        int exponent = sc.nextInt();

        int finalResult = (int) Math.pow(base, exponent);
        System.out.println(finalResult);
    }
}
