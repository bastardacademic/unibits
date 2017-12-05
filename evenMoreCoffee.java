import java.util.Scanner;

/* This program asks five people how they sweeten their coffee. The three possbile answers are: I don't, With Sugar, or With Sweetener. This program uses a While loop*/

class evenMoreCoffee
{
    public static void menu ()
    {
            System.out.println("How do you sweeten your coffee?");
	        System.out.println("1. I don't!");
	        System.out.println("2. With sugar?");
	        System.out.println("3. With sweetener?");
	        System.out.println("4. Exit");
	}

	public static void main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	
	    int personCount, preference, nothing, sugar, sweetener;
	
	    nothing = sugar = sweetener = personCount = 0;
	    {
            menu();
	        preference = input.nextInt();
	       
	        while (preference != 4)
			{
			personCount++;
				if (preference == 1)
	        	    nothing++;
	           	else if (preference == 2)
	        	         sugar++;
	        	else if (preference == 3)
	        	
	        	  	    sweetener++;    	  			
	            
	            else
	            {
	            	System.out.println("Incorrect selection, press any key to try again");
	        		personCount = personCount - 1;		
	        	}			               
                	menu();
	        		preference = input.nextInt();

	       	}	     
		    	System.out.println("Survey Report");
	    		System.out.println("=============");
	    		System.out.println(personCount + " people took this survey");
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
}