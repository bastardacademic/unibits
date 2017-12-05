import java.util.Scanner;

/* This program calculates affordable route home */

class homeward
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	Double ready;

	System.out.print ("Enter your ready money ");
	ready = input.nextDouble();

	if (ready >= 3.5)
		System.out.println ("Call a taxi");
	else if (ready >= 0.95)
		System.out.println ("Get the bus");
	else
		System.out.println ("Walk home");		
			}
}