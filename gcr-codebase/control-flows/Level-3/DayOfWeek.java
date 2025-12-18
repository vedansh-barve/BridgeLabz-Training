import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int day, month, year;
	System.out.print("Enter Day: ");
	day = input.nextInt();
	System.out.print("Enter Month: ");
	month = input.nextInt();
	System.out.print("Enter Year: ");
	year = input.nextInt();

	int y0 = year - (14 - month) / 12;
	int x = y0 + (y0/4) - (y0/100) + (y0/400);
	int m0 = month + 12 * ((14-month)/12) - 2;
	int d0 = (day + x + (31*m0) / 12) % 7;
	
	System.out.print(d0);
    }
}

