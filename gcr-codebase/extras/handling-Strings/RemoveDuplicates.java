import java.util.*;

public class RemoveDuplicates
{
    public static String RemoveDuplicates(String text)
    {
	boolean[] visited = new boolean[256];
        int len = text.length();
 	String result = "";
        for (int i = 0; i < len; i++)
        {
	    char ch = text.charAt(i);
            if (!visited[ch])
            {
		result += text.charAt(i);                
                visited[ch] = true;
            }
        }
	return result;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = input.next();

	String result = RemoveDuplicates(text);
	System.out.print("After Removing duplicates : " + result);        
    }
}
