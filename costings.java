import java.util.Scanner;

/* This program calculates cost based on area */

class costings
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int length, width, unit_cost, total_price;

	System.out.print ("Enter length in metres ");
	length = input.nextInt();

	System.out.print ("Enter width in metres ");
	width = input.nextInt();

	System.out.print ("Enter cost in £ ");
	unit_cost = input.nextInt();

	total_price = length * width * unit_cost;

	System.out.println ("The total price is £" + total_price);
	}
}