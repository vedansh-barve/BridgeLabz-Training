import java.util.Scanner;

public class FindUniqueChar
{
    public static int findLength(String text)
    {
        int lenCount = 0;
	try
	{
	    while(true)
	    {	
	        text.charAt(lenCount);
	        lenCount++;
	    }		
	}
	catch(StringIndexOutOfBoundsException e)
	{
	    return lenCount;
	}
    }	
	
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
	
    public static void main(String args[])
    {
	String text;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter String: ");
	text = input.next();
	int len = findLength(text);
	int uniqueCount = calcUniqueChar(text, len);
	char[] uniqueChar = findUniqueChar(text, len, uniqueCount);
	
	System.out.println("Unique Char Are: ");
	for(int i=0; i<uniqueChar.length; i++)
	{	
	    System.out.print(uniqueChar[i] + ", ");
	}
	
	
    }
}
