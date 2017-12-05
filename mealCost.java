import java.util.Scanner;

/* This program adds calculates a cost of a meal with a 5% discount applied for meals over £10 */

class mealCost
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double cost, total;

	System.out.print ("Please enter the total meal cost £");
	cost = input.nextDouble();

	if (cost >= 10) 
	{
	 	total = cost - (cost * 0.05);
		System.out.println ("The total is £" + total);

	 }
	 else
		System.out.println ("The total is £" + cost);
	
	}
}