import java.util.Scanner;

/*This program displays "Hello World" x amount of times*/

 class helloAgain
 {
	
	static void show()
	{
		System.out.println ("Hello World ");

	}
	
	public static void main(String args[])
	{
        
	Scanner input = new Scanner(System.in);
	
	double x = 0;
	        
	System.out.println("Enter Number Please :");
	x = input.nextInt();
	        
	for(int i = 0; i < x; i++)
		{
	    	show();

		}
	}
}