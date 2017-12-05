import java.util.Scanner;

/* This program outputs congratulations after a right answer */

class capital
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	String answer;

	System.out.print ("What is the capital city of France? ");
	answer = input.next();

	if (answer.equalsIgnoreCase("Paris"))
		System.out.println ("Congratulations, right answer! ");
	else
		{
		    System.out.println ("Please try again!" );
		    System.out.print ("What is the capital city of France? ");
	        answer = input.next();
		}
	}
}