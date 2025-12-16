import java.util.Scanner;

public class PerimeterOfTriangle {
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = sc.nextInt();
        
        System.out.print("Enter width: ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);
        System.out.println("Perimeter is " + perimeter);
    }
}
