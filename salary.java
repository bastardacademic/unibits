import java.util.Scanner;

/* This program adds two numbers together */

class salary
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double hw, rate, deduct, pay;

	System.out.print ("Enter hours worked ");
	hw = input.nextDouble();

	System.out.print ("Enter you hourly rate ");
	rate = input.nextDouble();

	System.out.print ("Enter your deductions ");
	deduct = input.nextDouble();

	pay = hw * rate - deduct;

	System.out.println ("Your pay is £ " + pay);
	}
}