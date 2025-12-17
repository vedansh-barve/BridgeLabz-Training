public class calcPenPerStudent
{
    public static void main(String args[])
    {
	int totalPen = 14;
	int noOfStudents = 3;
	int penPerStudent = totalPen/noOfStudents;
	int remainingPen = totalPen%noOfStudents;
	System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
    }
}