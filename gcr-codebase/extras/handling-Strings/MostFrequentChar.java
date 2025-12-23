import java.util.Scanner;

public class MostFrequentChar
{
    public static char findMostFrequentChar(String text)
    {
        int[] freq = new int[256];
        int len = text.length();
        for(int i = 0; i < len; i++)
        {
            char ch = text.charAt(i);
            if (ch != ' ')
            {
                freq[ch]++;
            }
        }
        char mostFrequent = text.charAt(0);
        int maxCount = 0;
        for(int i = 0; i < len; i++)
        {
            char ch = text.charAt(i);
            if(ch != ' ' && freq[ch] > maxCount)
            {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }
        return mostFrequent;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = input.nextLine();

        char result = findMostFrequentChar(text);
        System.out.println("Most Frequent Character is: " + result);
    }
}
