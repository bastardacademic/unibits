import java.util.Scanner;

/* This program calculates largest number */

class highestnum
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	int num, largest;

	// initialise sum and count here
largest = 0;

	do
	{
		System.out.print ("Enter a number ");
	num = input.nextInt();
    if (num > largest)
    
    	largest = num;   
    
	} while (num != 0);

	//output average here
	System.out.println ("The largest is " + largest);
	
	}
}