import java.util.Scanner;

public class VolumeOfCyclinder {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double radiusSquare = Math.pow(radius, 2);
        
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        double volume = 3.14 * radiusSquare * height;
        System.out.println(volume);

    }
}
