import java.util.Scanner;

/* This program calculates an employee's gross and net pay */

class payroll

 {
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        double rate = 0, hours = 0, gross = 0, net = 0;
        String name = "";
        
        System.out.println("Employee name or 'End' to exit");
	    name = input.next();
        
        while (!name.contentEquals("End"))
        {
	        if (name.contentEquals("End"))
	        	break;
	        
		    System.out.println("What is your hourly rate? ");
		    rate = input.nextDouble();
		    
		    System.out.println("How many hour have you worked? ");
		    hours = input.nextDouble();
		    
		    gross = rate * hours;
		    net = gross - (gross * .3);
		    
		    System.out.println(name + "'s Gross pay is : " + gross);
		    System.out.println(name + "'s Net pay is  : " + net);

		    System.out.println("Employee name or 'End' to exit");
	        name = input.next();
        }
    }
}