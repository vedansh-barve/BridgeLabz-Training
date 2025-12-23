import java.util.Scanner;

public class CompareStrings
{
    public static int compareStrings(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = (len1 < len2) ? len1 : len2;

        for (int i = 0; i < minLen; i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2)
            {
                return c1 - c2;            
	    }
        }
        return len1 - len2;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = input.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = input.nextLine();

        int result = compareStrings(s1, s2);

        if (result == 0)
            System.out.println("Both strings are equal");
        else if (result < 0)
            System.out.println("First string comes before second");
        else
            System.out.println("First string comes after second");
    }
}
