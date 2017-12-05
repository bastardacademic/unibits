import java.util.Scanner;

/* This program calculates the total and average commission of 10 employees */

class commission
{
	public static void main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	
	    double commission, total, avg, emp;
	
	    commission = total = avg = 0;
	    for (emp = 1; emp <=10; emp++)
	    {
	        
	        System.out.println("Please enter your commission");
	        commission = input.nextDouble();
	        	
	        total = total + commission;
	        avg = total / 10;
	        
	    }

	    System.out.println("The total commission is " + total + " and the average commission is " + avg);

	}
}