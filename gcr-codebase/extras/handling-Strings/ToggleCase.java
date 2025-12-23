import java.util.Scanner;

public class ToggleCase
{
    public static String toggleCase(String text)
    {
        int len = text.length();
        String result = "";

        for(int i = 0; i < len; i++)
        {
            char ch = text.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                result = result + (char)(ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                result = result + (char)(ch - 32);
            }
            else
            {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = input.nextLine();

        String output = toggleCase(text);
        System.out.println("Toggled Case: " + output);
    }
}
