import java.util.Scanner;

public class CalculateSimpleInterestt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int principal = sc.nextInt();

        System.out.print("Enter rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        int simpleIntrest = (principal * rate * time) / 100;
        System.out.print("Simple Interest is: " + simpleIntrest);

    }   
}
