import java.util.Scanner;

public class CollinearPoints {
    public boolean areCollinearUsingSlope(double[] x, double[] y) {

        double x1 = x[0], y1 = y[0];
        double x2 = x[1], y2 = y[1];
        double x3 = x[2], y3 = y[2];

        boolean slopesAreEqual = (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);

        return slopesAreEqual;
    }

    public boolean areCollinearUsingArea(double[] x, double[] y) {

        double area = 0.5 * ((x[0] * (y[1] - y[2])) + (x[1] * (y[2] - y[0])) + (x[2] * (y[0] - y[1])));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CollinearPoints obj = new CollinearPoints();
        double[] x = new double[3], y = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter x%d y%d: ", i + 1, i + 1);
            x[i] = input.nextDouble();
            y[i] = input.nextDouble();
        }

        System.out.println("Collinearity using Slope : " + obj.areCollinearUsingSlope(x, y));
        System.out.println("Collinearity using area : " + obj.areCollinearUsingArea(x, y));

        input.close();
    }
}