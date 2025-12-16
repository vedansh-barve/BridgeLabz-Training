import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]){
        System.out.print("Enter radius: ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double radiusSquare = Math.pow(radius, 2);

        System.out.print(3.14*radiusSquare);
    }
}
