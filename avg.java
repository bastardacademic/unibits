import java.util.Scanner;

/* This program calculates the average of 4 numbers */

class avg
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double a, b, c, d;

	System.out.print ("Enter first number ");
	a = input.nextDouble();

	System.out.print ("Enter second number ");
	b = input.nextDouble();

	System.out.print ("Enter third number ");
	c = input.nextDouble();
	
	System.out.print ("Enter fourth number ");
	d = input.nextDouble();

	e = a + b + c + d / 4;

	System.out.println ("The average is " + e);
	}
}