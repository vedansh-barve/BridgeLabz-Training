package com.day10.linecomparison;
import java.util.ArrayList;
import java.util.Scanner;

public class LineComparisonDemo {

	static void compareLines(Line l1, Line l2) {
        double len1 = l1.getLength();
        double len2 = l2.getLength();

        if (len1 == len2) {
            System.out.println("Both lines are equal in length.");
        } else if (len1 > len2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        ArrayList<Line> lines = new ArrayList<>();

        System.out.print("Enter number of lines to compare: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter coordinates for Line " + (i + 1));
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            lines.add(new Line(x1, y1, x2, y2));
        }

        for (int i = 0; i < lines.size() - 1; i++) {
            System.out.println("\nComparing Line " + (i + 1) + " and Line " + (i + 2));
            compareLines(lines.get(i), lines.get(i + 1));
        }

        sc.close();
		
	}

}
