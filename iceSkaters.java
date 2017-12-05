import java.util.Scanner;

/*Calculates the scores (max, min and average) of ice skaters*/

class iceSkaters
{
	  public static void main(String args[])
	    {
	        int scores[] = new int[6];
	        double avg = 0, max = 0, min = 0, sum=0;
	        Scanner input = new Scanner(System.in);
	      
		        for (int i = 0; i < 6; i++)
		        {
			        System.out.println((i + 1) + " -Enter Score: ");
			        scores[i] = input.nextInt();
		        }
		        max = scores[0];
		        min = scores[0];

		        for (int i = 0; i < 6; i++)
		        {
		              if (scores[i] > max)
		              {
		            	  max = scores[i];
		              }
		              else if (scores[i] < min)
		              {
		            	  min = scores[i];
		              }
		         }
		       for (int i = 0; i < 6; i++)
		        {
		              if (scores[i] != max || scores[i] != min)
		              {
		            	  sum += scores[i];
		              }
		         }
		    avg = sum / 4;	
		    System.out.println("The maximum score is: " + max);
		    System.out.println("The minimum score is: " + min);
	        System.out.println("The average score is: " + avg);
	    }
}
