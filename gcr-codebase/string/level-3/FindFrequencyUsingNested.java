import java.util.*;

public class FindFrequencyUsingNested
{
    public static int calcUniqueChar(String text)
    {
        int len = text.length();
        int uniqueCount = 0;

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

            if (i == text.indexOf(ch))
            {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static String[] findFrequencyNested(int uniqueCount, String text)
    {
        String[] result = new String[uniqueCount * 2];
        int idx = 0;
        boolean[] visited = new boolean[256];
        int len = text.length();

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

            if (!visited[ch])
            {
                result[idx++] = ""+ch;
                result[idx++] = Integer.toString(count);
                visited[ch] = true;
            }
        }
        return result;
    }

    public static void displayFrequency(String[] result)
    {
       System.out.println(Arrays.toString(result));
        
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = input.next();

        int uniqueCount = calcUniqueChar(text);
        String[] result = findFrequencyNested(uniqueCount, text);
        displayFrequency(result);
    }
}
