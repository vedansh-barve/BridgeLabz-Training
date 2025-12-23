import java.util.Scanner;

public class SubstringOccurrence
{
    public static int countOccurrences(String text, String sub)
    {
        int count = 0;
        int len = text.length();
        int subLen = sub.length();

        for(int i = 0; i <= len - subLen; i++)
        {
            int j;
            for(j = 0; j < subLen; j++)
            {
                if(text.charAt(i + j) != sub.charAt(j))
                {
                    break;
                }
            }

            if(j == subLen)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = input.nextLine();

        System.out.print("Enter Substring: ");
        String sub = input.nextLine();

        int result = countOccurrences(text, sub);
        System.out.println("Occurrences: " + result);
    }
}
