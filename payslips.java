import java.util.Scanner;

/* This program calculates the gross pay for 5 employees */

class payslips
{
	public static void main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	
	    double hours, rate, pay, emp;
	
	    hours = rate = pay = 0;
	    for (emp = 1; emp <=5; emp++)
	    {
	        
	        System.out.println("Please enter your hours");
	        hours = input.nextDouble();
	        
	        System.out.println("Please enter your rate");
	        rate = input.nextDouble();
	
	        pay = hours * rate;
	        
	        System.out.println("Your gross pay is " + pay);
	    }

	}
}