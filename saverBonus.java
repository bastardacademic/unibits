import java.util.Scanner;

/*This program calculates a savers' bonus balance*/

public class saverBonus
{
	public static void main(String args[])
	{
		double[][] savers = new double[4][2];
	    double bonus = 0;
		Scanner input = new Scanner(System.in); 
		  
		System.out.println("Enter Percentage Bonus: ");
		bonus = input.nextInt();
		for (int i = 0; i < 4; i++)
		{
		    System.out.println((i + 1) + "Enter Savers' Balance: ");
			Savers[i][0] = input.nextInt();
			Savers[i][1] = bonus;
		}
		   
		for(int i = 0;i < 4;i++)
		{
		    double temp = savers[i][0] + (savers[i][0] * (savers[i][1] / 100));
		    System.out.println("Savers' new balance " + (i+1) + " is " + temp);
			  
		}
	}
}