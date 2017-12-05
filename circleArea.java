import java.util.Scanner;

/*This program calculates the area of a circle*/

class circleArea
{
	
	static double areaCalc(double radius)
	{
		double area = 0;
		
		area = 3.141 * (radius * radius);
		return area;
	}
	
	 public static void main(String args[])
	{
	    Scanner input = new Scanner(System.in);

	    double radius = 0;
	        
	    System.out.println("Enter Radius Please :");
	    radius = input.nextDouble();
	        
	    System.out.println("Your circle's area is: " + areaCalc(radius));
	}
}