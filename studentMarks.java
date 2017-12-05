import java.util.Scanner;

/* This program advises on whether students Pass or Fail and examination */

class studentMarks
{
	public static void main(String [] args)

	{
	
	Scanner input = new Scanner(System.in);

	int student, mark, count;

	System.out.println("Enter the number of students ");
	count = input.nextInt();

	student = mark = 0;
	for (student = 1; student <= count; student++)
		{
			System.out.println("Enter the students' mark ");
			mark = input.nextInt();

	    	if (mark < 40)
	    		System.out.println("Fail");	
    	
    		else
    			System.out.println("Pass");
    	}
	}
}