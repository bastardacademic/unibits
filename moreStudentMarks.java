import java.util.Scanner;

/* This program advises on whether students Pass or Fail an examination */

class moreStudentMarks
{
	public static void main(String [] args)

	{
	
		Scanner input = new Scanner(System.in);

		int student, fail, pass;
		double avg, mark, count;

		fail = pass = student = 0;
		mark = count = 0;

		while (mark >= 0)
		{
			System.out.println("Enter the students' mark ");
			mark = input.nextDouble();

      count = mark + count;
           
        if (mark < 40)
	   		{
	   			System.out.println ("Fail");
        	  fail++;
        	  student++;
        }
    		
    		else if (mark >= 40 && mark > 0)
    		{
    			System.out.println ("Pass");
            pass++;
            student++;
        }
    }
    
    	avg = count / student;
    	System.out.println(student + " students took the test.");
    	System.out.println(pass + " passed the test.");
    	System.out.println(fail + " failed the test.");
   		System.out.println("The average mark is " + avg + ".");

	}
}