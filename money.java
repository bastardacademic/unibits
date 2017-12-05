import java.util.Scanner;

/* This program calculates how many notes you have, and their total value */

class money
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int a, b, c, d, e;

	System.out.print ("How many £5 notes do you have? ");
	a = input.nextInt();

	System.out.print ("How many £10 notes do you have? ");
	b = input.nextInt();

	System.out.print ("How many £20 notes do you have? ");
	c = input.nextInt();

	d = (a * 5) + (b * 10) + (c * 20);

	e = a + b + c;

	System.out.println ("You have " + e + " notes. The total in notes you have is £" + d);
	}
}