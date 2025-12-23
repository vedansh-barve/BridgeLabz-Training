import java.util.Scanner;

public class FindFirstNonRepeatChar
{
    public static char findNonRepeat(String text)
    {
        int len = text.length();
	char nonrepeat;
	for (int i = 0; i < len; i++) 
	{
            char ch = text.charAt(i);
            int count = 0;

            for (int j = 0; j < len; j++) 
	    {
                if (ch == text.charAt(j)) 
		{
                    count++;
                }
            }

            if (count == 1) {
                return ch;
            }
        }
	return '\0';
    }	
	
   		
    public static void main(String args[])
    {
	String text;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter String: ");
	text = input.next();
	char uniqueChar = findNonRepeat(text);	
	
	System.out.println("Unique Char is: " + uniqueChar);
    }
}
