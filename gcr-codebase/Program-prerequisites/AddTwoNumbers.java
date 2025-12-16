import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int value1 = sc.nextInt();

        System.out.print("Enter Second Value: ");
        int value2 = sc.nextInt();

        System.out.print(value1 + value2);
    }
}