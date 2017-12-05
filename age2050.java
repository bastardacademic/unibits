import java.util.Scanner;

/* This program calculates your age in the year 2050 */

class age2050
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int year, age, old;

	System.out.print ("Enter your birth year ");
	year = input.nextInt();

	age = 2050;
	old = age - year;

	if (old > 0)
		System.out.println ("In 2050, you will be " + old + " years old");
	else
		{
			System.out.println ("You haven't been born yet! Try again");
			System.out.print ("Enter your birth year ");
			year = input.nextInt();
		}
	}
}