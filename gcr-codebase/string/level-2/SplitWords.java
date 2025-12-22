import java.util.Scanner;
import java.lang.Integer;

public class SplitWords
{
    public static String[] splitTextIntoWords(String text)   
    {	
	int noOfWords = 0;
	int size = text.length();
	int wordcount = 0;	

	String temp = "";
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    if(ch == ' ')
	    {
		wordcount++;
		temp = "";
	    }
	    else
		temp += ch;
	}	

	String[] words = new String[wordcount];
	temp = "";
	int index = 0;
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    if(ch == ' ')
	    {
		words[index++] = temp;
		temp = "";
	    }
	    else
		temp += ch;
	}
	return words;
    } 
		    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter Text: ");
	text = input.nextLine();
	int size = text.length();
	
	
	String[] words = splitTextIntoWords(text);
	for(int i=0; i<words.length; i++)
	{	
	    System.out.print(words[i] + ", ");
	}
		
    }
}