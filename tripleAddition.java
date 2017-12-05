import java.util.Scanner;

/* This program adds two numbers together */

class tripleAddition
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int a, b, c, d;

	System.out.print ("Enter first number ");
	a = input.nextInt();

	System.out.print ("Enter second number ");
	b = input.nextInt();

	System.out.print ("Enter third number ");
	c = input.nextInt();

	d = a + b + c;

	System.out.println ("The sum is " + d);
	}
}