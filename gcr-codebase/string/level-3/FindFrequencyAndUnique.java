import java.util.Scanner;

public class FindFrequencyAndUnique
{
   public static int calcUniqueChar(String text, int len)
    {
	int uniqueCount = 0;
	for (int i = 0; i < len; i++) {
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
                uniqueCount++;
            }
        }
	return uniqueCount;
    }

   public static char[] findUniqueChar(String text, int len, int uniqueCount)
    {
	 char[] uniqueChar = new char[uniqueCount];
	 int idx = 0;
	 for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            int count = 0;

            for (int j = 0; j < len; j++) {
                if (ch == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueChar[idx++] = ch;
            }
        }
	return uniqueChar;	
    }


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
	int len = text.length();
	char[][] result = findFrequency(text);	
	int uniqueCount = calcUniqueChar(text, len);
	char[] uniqueChar = findUniqueChar(text, len, uniqueCount);	

	System.out.print("Unique Char Are: ");
	for(int i=0; i<uniqueChar.length; i++)
	{	
	    System.out.print(uniqueChar[i] + ", ");
	}
	System.out.println("");
	
	displayFrequency(result);
	
    }
}
