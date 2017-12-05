import java.util.Scanner;

/* This is a higher or lower guessing game */

class higherLower
{
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
    
        int p1 = 0, p2 = 9999999, guess = 0;
  
        System.out.println("What number do you want Player 2 to guess?");
        p1 = input.nextInt();

        while (p1 != p2 )
        {
	        System.out.println("Player 2, take your guess! ");
	        p2 = input.nextInt();
	        guess++;

	        if (p2 > p1) 
	        {
	        	System.out.println("Try Lower");

	        } 

	        else if (p2 < p1) 
	        {
	        	System.out.println("Try Higher");

	        } 
        }
        
        System.out.println("Congratulations!");
        System.out.println("Player 2 took " + guess + " guesses");
        System.out.println("GAME OVER!");
    }
}