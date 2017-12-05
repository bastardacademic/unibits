import java.util.Scanner;

/* This program calculates the square and cube of 7 integers */

class squareCube
{
	public static void main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	
	    int myInt, mySquare, myCube;
	
	    mySquare = myCube = 0;
	    for (myInt = 1; myInt <=7; myInt++)
	    {
	        
	        System.out.println("Please enter your integer");
	        myInt = input.nextInt();
	
	        mySquare = myInt * myInt;
	        myCube = mySquare * myInt;
	        
	        System.out.println("The square of your number is " + mySquare + " and the cube is " + myCube);
	    }

	}
}