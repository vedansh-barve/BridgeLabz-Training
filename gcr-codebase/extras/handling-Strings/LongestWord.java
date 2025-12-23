import java.util.Scanner;

public class LongestWord
{
    public static String findLongestWord(String text)
    {
        int len = text.length();
        String word = "";
        String longestWord = "";

        for(int i = 0; i < len; i++)
        {
            char ch = text.charAt(i);

            if (ch != ' ')
            {
                word = word + ch;
            }
            else
            {
                if (word.length() > longestWord.length())
                {
                    longestWord = word;
                }
                word = "";
            }
        }
        if(word.length() > longestWord.length())
        {
            longestWord = word;
        }

        return longestWord;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String text = input.nextLine();

        String result = findLongestWord(text);
        System.out.println("Longest Word: " + result);
    }
}
