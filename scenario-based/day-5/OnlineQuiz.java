// Online Quiz Application 🧠
// Ask 5 questions (MCQs) from a user.
// Use arrays and for-loop.
// Record score.
// Switch for answer checking. Apply clear indentation and structured layout.

import java.util.Scanner;

public class OnlineQuiz
{
    public static String[] makeQuestions()
    {
	String[] questions = new String[5];
	questions[0] = "Java is used to build";
	questions[1] = "Which is primitive data type";
	questions[2] = "When String is created using literals where it is stored";
	questions[3] = "When String is created using new where it is stored";
	questions[4] = "Which of the following is NoSQL Database";
	
	return questions;
    }

    public static String[][] makeOptions()
    {
	String[][] options = new String[5][3];
	options[0][0] = "Secure"; options[0][1] = "Robust"; options[0][2] = "All Of Above";
	options[1][0] = "String"; options[1][1] = "Class"; options[1][2] = "float";
	options[2][0] = "Both (B and C)"; options[2][1] = "Heap"; options[2][2] = "String Constant Pool";
	options[3][0] = "String Constant Pool"; options[3][1] = "Heap"; options[3][2] = "Both (A and B)";
	options[4][0] = "None of the below"; options[4][1] = "MySQL"; options[4][2] = "MongoDB";
	
	return options;
    }

    public static void startTest()
    {
	Scanner input = new Scanner(System.in);
	int atQues = 0;
	String[] questions = makeQuestions();
	String[][] options = makeOptions();
	System.out.println("------------------------------Lets Start The Quiz-------------------------(Total - 25 marks {5 marks Each})");
	int totalMarks = 0;

	while(atQues < 5)
	{
	    char userChoice;
	    System.out.println("Question " + (atQues+1) + ": " + questions[atQues]);
	    System.out.println("A-> " + options[atQues][0]);
	    System.out.println("B-> " + options[atQues][1]);
	    System.out.println("C-> " + options[atQues][2]);
	    userChoice = input.next().charAt(0);

	    switch(userChoice)
	    {
		case 'C':
		    totalMarks += 5;
		    
	    }
	    atQues++;
	}

	System.out.println("-----------------------------------------------------------------");
	System.out.println("-------Total Marks: " + (totalMarks));
	System.out.println("-----------------------------------------------------------------");
    }

    public static void main(String args[])
    {
	startTest();
    }
}