import java.util.Scanner;

//*saversMethod*/

public class saversMethod
{
	
	public static double[][] balance()
    {
		double[][] array = new double[4][2];
		double bonus = 0;
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter Percentage Bonus: ");
	    bonus = input.nextInt();
	    
        for(int i = 0; i < 4; i++)
        {
  			System.out.println((i+1) + "Enter Savers' Balance: ");
  			array[i][0] = input.nextInt();
  			array[i][1] = bonus; 
        }    
        return array;
    }
	
	static double[][] updateBalance(double [][]array)
	{
		for(int i = 0; i < 4; i++)
		{
			array[i][1] = array[i][0] + (array[i][0] * (array[i][1] / 100));
			  
		}

	return array;
	}
	
	static void Prt(double [][]array)
	{
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Savers' new balance" + (i + 1) + " is: " + array[i][1]);
			  
		}
	}
	
	public static void main(String args[])
	{
	    double[][] savers = balance();
		savers = updateBalance(savers);
		Prt(savers);
		   
	}
}
