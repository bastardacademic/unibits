import java.util.Scanner;

/* This program calculates mean average */

class average3
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);

	double sum, num, avg, count;

	// initialise sum and count here
	sum = 0;

	for (count = 1; count <= 3; count = count + 1)
	{
		System.out.print ("Enter a number ");
		num = input.nextDouble();
	    
	    sum = sum + num;
   	} 

	avg = sum / (count - 1);
	System.out.println ("The average is " + avg);
	}
}