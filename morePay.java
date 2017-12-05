import java.util.Scanner;

/* This program calculates gross pay and tax*/

class morePay
{
	static double GrossCalc(double rateH, double hours, double rateOT)
	{
		double  grossP = 0;
	    grossP = rateH * hours;
	    
	    if (hours > 40)
	    {
	    	double temp = 40 - hours;
	    	grossP = grossP + (rateOT * temp);
	    }
		return grossP;
	}

		
	static double taxCalc(double grossP, String status )
	{
		double tax = 0;

		if (status.contentEquals("Single"))
		{
			tax = (grossP * .3);
		}
		else if (status.contentEquals("Married"))
		{
			 tax = (grossP * .25);
		}
		return tax;
	}

	static void prtSlip(double grossP, String status, String name, double tax)
	{
		System.out.println("* Name : " + name);
        System.out.println("* Status :" + status);
	    System.out.println("* Gross Pay : " + grossP);
	    System.out.println("* Tax : " + tax);
	}

	 public static void main(String args[])
	    {
		 
			Scanner input = new Scanner(System.in);

			double rateH = 0, hours = 0, grossP = 0, rateOT = 0, tax=0;
	    	String name = "";
	    	String status = "";
	        
	        System.out.println("Enter Your Name: ");
		    name = input.next();

	        System.out.println("Enter your marital status: ");
	        status = input.next();

		    System.out.println("Enter your hourly rate: ");
		    rateH = input.nextDouble();

		    System.out.println("Enter your hours: ");
		    hours = input.nextDouble();
		    
		    grossP = grossCalc(rateH, hours, rateOT);
		    tax = taxCalc(grossP, status );
		    prtSlip(grossP, status, name, tax);
	    }
}