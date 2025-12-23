import java.util.Scanner;

public class CalculateGradeTwoDString
{
    public static int[][] generateMarks(int noOfStudents)
    {
	int[][] marksArr = new int[noOfStudents][3];
	for(int i=0; i<noOfStudents; i++)
	{
	    marksArr[i][0] = (int)((Math.random() * 90)+10);
	    marksArr[i][1] = (int)((Math.random() * 90)+10);
	    marksArr[i][2] = (int)((Math.random() * 90)+10);
	}
	return marksArr;
    }
	
    public static int[] calculatePercentage(int[][] marksArr, int noOfStudents)
    {
	int[] percentArr = new int[noOfStudents];

	for(int i=0; i<noOfStudents; i++)
	{
	    int sum = marksArr[i][0] + marksArr[i][1] + marksArr[i][2];
	    percentArr[i] = (sum*100) / 300;
	    
	}
	return percentArr;
    }
	
    public static String[] calculateGrade(int[] percentArr, int noOfStudents)
    {
	String[] gradeArr = new String[noOfStudents];
	for(int i=0; i<noOfStudents; i++)
	{
	    if(percentArr[i] >= 80 && percentArr[i] <= 100)
	    	gradeArr[i] = "Grade A";
	    else if(percentArr[i] >= 70 && percentArr[i] <= 79)
	    	gradeArr[i] = "Grade B";
	    else if(percentArr[i] >= 60 && percentArr[i] <= 69)
	    	gradeArr[i] = "Grade C";
	    else if(percentArr[i] >= 50 && percentArr[i] <= 59)
	    	gradeArr[i] = "Grade D";
	    else if(percentArr[i] >= 40 && percentArr[i] <= 49)
	    	gradeArr[i] = "Grade E";
	    else if(percentArr[i] <= 39 && percentArr[i] >= 0)
	    	gradeArr[i] = "Grade R";
	}
	return gradeArr;
    }
   
    public static void displayLevel(int[][] marksArr, int[] percentArr, String[] gradeArr, int noOfStudents)
    {
	for(int i=0; i<noOfStudents; i++)
	{
	    System.out.print("Student " + (i+1) + " marks are: ");
	    System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
	    System.out.println("His percentage is: " + percentArr[i]);
	    System.out.print(gradeArr[i] + " : ");
	
	    if(gradeArr[i].equals("Grade A"))
	        System.out.println("Level 4, above agency-normalised standards");
	    else if(gradeArr[i].equals("Grade B"))
	        System.out.println("Level 3, at agency-normalised standards");
	    else if(gradeArr[i].equals("Grade C"))
	        System.out.println("Level 2, below but approaching agency-normalised standards");
	    else if(gradeArr[i].equals("Grade D"))
	        System.out.println("Level 1, well below agency-normalised standards");
	    else if(gradeArr[i].equals("Grade E"))
	        System.out.println("Level 1-, too below agency-normalised standards");
	    else if(gradeArr[i].equals("Grade R"))
	        System.out.println("Remedial Standards");	
	}	
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int noOfStudents;
	System.out.print("Enter the no. of students: ");
	noOfStudents = input.nextInt();
	
	int[][] marksArr = generateMarks(noOfStudents);
	int[] percentArr = calculatePercentage(marksArr, noOfStudents);
	String[] gradeArr = calculateGrade(percentArr, noOfStudents);	
	displayLevel(marksArr, percentArr, gradeArr, noOfStudents);	
    }
}