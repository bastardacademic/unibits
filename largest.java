import java.util.Scanner;

/* This program outputs value of two numbers */

class largest
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int x, y, z;

	System.out.print ("Enter first number ");
	x = input.nextInt();

	System.out.print ("Enter second number ");
	y = input.nextInt();

	if (x > y)
		z = x;
	else
		z = y;

		System.out.println ("The largest number is " + z);
	}
}