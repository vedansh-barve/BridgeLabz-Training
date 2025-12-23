import java.util.Scanner;

public class ReverseString {
	
    public static String reverseTheString(String text)
    {
	String result = "";
	for(int i=text.length()-1; i>=0; i--)
	{
	    result += text.charAt(i);
	}
	return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();
	
	String result = reverseTheString(text);
	System.out.print("The reverse String is: " + result);

        
        sc.close();
    }

  }