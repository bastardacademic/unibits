import java.util.Scanner;

/* This program calculates area and cost*/

class carpetCost
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double length, width, unit_cost, total_price, total_size;

	System.out.print ("Enter length in metres ");
	length = input.nextDouble();

	System.out.print ("Enter width in metres ");
	width = input.nextDouble();

	System.out.print ("Enter cost in £");
	unit_cost = input.nextDouble();

	total_size = length * width;

	total_price = length * width * unit_cost;

	System.out.println ("The total room area is " + total_size + "sq.m. The total price is £" + total_price);
	}
}