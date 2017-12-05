import java.util.Scanner;

/* This program calculates bike insurance cost*/

class bikeInsurance
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double basic_rate, mount, u25, total_cost, sub;
	
	String answer, age;
	
	10 = mount;
	5 = u25;
	30 = basic_rate;

	System.out.print ("Mountain bike or touring bike? ");
	answer = input.next();

	if (answer.equalsIgnoreCase("mount"))
	    {
		basic_rate + mount = sub;
		System.out.println ("Are you under 25? ");
		age = input.next();
		}
		if (age.equalsIgnoreCase("yes"))
		{
		sub + u25 = total_cost
		System.out.println ("Your total cost is £" + total_cost);
		}
		
		else 
		System.out.println ("Your total cost is £" + sub);
		
	else
		
		    System.out.println ("Are you under 25? ");
		    age = input.next();
		
		    if (age.equalsIgnoreCase("yes"))
		    {
		    basic_rate + u25 = total_cost;
		    System.out.println ("Your total cost is £" + total_cost);
		    }
		    
		    else 
		    System.out.println ("Your total cost is £" + sub);

	}

	}
}