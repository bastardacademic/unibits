import java.util.Scanner;

/* This program adds two numbers together */

class add
{
	public static void main(String [] args)

	{
	Scanner input = new Scanner(System.in);

	int a, b, c;

	System.out.print ("Enter first number ");
	a = input.nextInt();

	System.out.print ("Enter second number ");
	b = input.nextInt();

	c = a + b;

	System.out.println ("The sum is " + c);
	
	}
}