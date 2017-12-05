import java.util.Scanner;

/* This program calculates mean average */

class average
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double sum, num, avg, count;

	// initialise sum and count here
sum = 0;
count = 0;

	do
	{
		System.out.print ("Enter a number ");
	num = input.nextDouble();
    if (num > 0)
    {
    	count = count + 1;
    	sum = sum + num;
    
    }

	} while (num != 0);

avg = sum / count;
	//output average here
	System.out.println ("The average is " + avg);
	
	}
}