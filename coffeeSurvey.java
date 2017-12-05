import java.util.Scanner;

/* This program asks five people how they sweeten their coffee. The three possbile answers are: I don't, With Sugar, or With Sweetener. At the end of the program, a report of the survey is listed, showing the results*/

class coffeeSurvey
{
	public static void main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	
	    int person, preference, nothing, sugar, sweetener;
	
	    nothing = sugar = sweetener = 0; // set all these to 0
	    for (person = 1; person <=5; person++)
	    {
	        
	        System.out.println("How do you sweeten your coffee?");
	        System.out.println("1. I don't!");
	        System.out.println("2. With sugar?");
	        System.out.println("3. With sweetener?");
	        preference = input.nextInt();
	
	        if (preference == 1)
	            nothing++; //increment it!
	        else if (preference == 2)
	                 sugar++;
	        else if (preference == 3)
	            sweetener++;
	        else
	        {	
	        	System.out.println("Incorrect selection, press any key to try again");
	            person = person - 1;
	        	System.out.println("How do you sweeten your coffee?");
	        	System.out.println("1. I don't!");
	        	System.out.println("2. With sugar?");
	        	System.out.println("3. With sweetener?");
	        	preference = input.nextInt();
	    	}
	        	
	    }
	    System.out.println("Survey Report");
	    System.out.println("=============");
	    if (nothing == 1)
	    	System.out.println(nothing + " person doesn't sweeten");
	    else
	    	System.out.println(nothing + " people don't sweeten");
	    if (sugar == 1)
	    	System.out.println(sugar + " takes sugar");
		else
			System.out.println(sugar + " take sugar");
		if (sweetener == 1)
	    	System.out.println(sweetener + " takes sweetener");
		else
			System.out.println(sweetener + " take sweetener");
	}
}