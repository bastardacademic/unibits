import java.util.Scanner;

/* This program calculates standard and overtime pay*/

class payDay
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double std_hrs, std_pay, std_paysun, ot_hrs, ot_paysun, ot_pay, total_pay, total_hrs;
	String day;
	
	std_pay = 8;
	ot_pay = 12;
	std_paysun = 15;
	ot_paysun = 20;

	System.out.print ("Enter standard hours worked ");
	std_hrs = input.nextDouble();

	System.out.print ("Enter overtime hours worked ");
	ot_hrs = input.nextDouble();

	System.out.print ("Enter the day code ");
	day = input.next();
	
	if (day.equalsIgnoreCase("sun"))
	{
	    total_pay = (std_hrs * std_paysun) + (ot_hrs * ot_paysun);
	    total_hrs = std_hrs + ot_hrs;
	    System.out.println ("Your total Sunday hours are " + total_hrs + " and your earnings today are £" + total_pay);
	}

    else if (day.equalsIgnoreCase("wk"))
    {	    
    	total_pay = (std_hrs * std_pay) + (ot_hrs * ot_pay);
	    total_hrs = std_hrs + ot_hrs;
	    System.out.println ("Your total weekday hours are " + total_hrs + " and your earnings today are £" + total_pay);
	}

	}
}