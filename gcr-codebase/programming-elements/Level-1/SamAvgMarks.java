class SamAvgMarks
{
    public static void main(String args[])
    {
    	int mathMarks = 94;
	int physicsMarks = 95;
	int chemistryMarks = 96;
	int avgMarks = (((physicsMarks + mathMarks + chemistryMarks) * 100 / 300));
	
	System.out.print("Sams average mark in PCM is: " + avgMarks);
    }
}