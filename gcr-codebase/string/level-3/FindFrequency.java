import java.util.Scanner;

public class FindFrequency
{
    public static char[][] findFrequency(String text)
    {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                count++;
                visited[ch] = true;
            }
        }

        char[][] result = new char[count][2];
        int index = 0;
        visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                result[index][0] = ch;              
                result[index][1] = (char)freq[ch]; 
                index++;
                visited[ch] = true;
            }
        }
	return result;
    }	

    public static void displayFrequency(char[][] result)
    {
	for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " - " + (int)result[i][1]);
        }
    }
	
   		
    public static void main(String args[])
    {
	String text;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter String: ");
	text = input.next();
	char[][] result = findFrequency(text);	
	displayFrequency(result);
	
    }
}
