import java.util.Scanner;

public class RemoveSpecificChar
{
    public static String removeChar(String text, char remove)
    {
        int len = text.length();
        String result = "";

        for(int i = 0; i < len; i++)
        {
            char ch = text.charAt(i);

            if(ch != remove)
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
        System.out.print("Enter Character to remove: ");
        char remove = input.next().charAt(0);

        String result = removeChar(text, remove);
        System.out.println("After removing: " + result);
    }
}
