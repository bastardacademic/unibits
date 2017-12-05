import java.util.Scanner;

/* This program outputs value of three numbers */

class nested
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int x, y, z;

	System.out.print ("Enter first number ");
	x = input.nextInt();

	System.out.print ("Enter second number ");
	y = input.nextInt();

	System.out.print ("Enter third number ");
	z = input.nextInt();

	if (x > y)
		if (x > z)
			System.out.println ("The largest number is " + x);
		else
			System.out.println ("The largest number is " + z);
		
	else
		if (y > z)
			System.out.println ("The largest number is " + y);
		else
			System.out.println ("The largest number is " + z);
	}
}