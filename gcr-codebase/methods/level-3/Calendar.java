import java.util.Scanner;

public class Calendar
{
    
    static boolean isLeapYear(int year) 
	{
        if (year % 400 == 0) 
		    {
                return true;
            }
        else if (year % 4 == 0 && year % 100 != 0) 
		    {
                return true;
            }
		else 
		    {
                return false;
            }
    }

    static byte getDay(int month, int day, int year) 
	{
        
        int totalDays = 0;

        
        totalDays+= (year - 1) + (year-1)/4 - (year-1)/100 + (year-1)/400;

        
        int arr[] = {3,0,3,2,3,2,3,3,2,3,2,3};

        
        for (int i = 1; i<month; i++) 
		{
            totalDays += arr[i-1];
        }

        
        if (isLeapYear(year) && month  > 2) 
		{
            totalDays += 1;
        }
        totalDays+=day;

        int dayOfWeek = totalDays%7;

        return (byte)dayOfWeek;
    }

    static String getMonth(int month)
	{
        String []months = 
		{"January", "February","March","April","May", "June","July","August","September","October","November", "December"};
           


        return months [month-1];
    }

    static int getDaysInMonth(int month, int year){
        int []days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month-1];
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input the month and year: ");
        int month = input.nextInt(), year = input.nextInt();

        System.out.println();
        System.out.println(Calendar.getMonth(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = Calendar.getDay(month,1,year);
        int totalDays = Calendar.getDaysInMonth(month,year);

        int currentDay = firstDay*-1;
        for (int outerCounter = 0; outerCounter < 6 && currentDay < totalDays ; outerCounter++) {
            for (int day = 1; day <= 7; day++) {
                currentDay++;
                if (currentDay < 1) {
                    System.out.print("    ");
                    continue;
                } else if (currentDay > totalDays) {
                    break;
                } else {
                    System.out.printf("%3d ",currentDay);
                }
            }
            System.out.println();
        }
    }
}