import java.util.Scanner;

/*This program calculates the area of a circle and cylinder volume*/

class cylinderVolume
{
	static double areaCalc(double radius)
	{
		double area = 0;
		
		area = 3.141 * (radius * radius);
		return area;
	}

	static double volumeCalc(double area, double height)
	{
		double vol = 0;
		vol = area * height;
		return vol;
	}

	 public static void main(String args[])
	{
	    Scanner input = new Scanner(System.in);

	    double radius = 0, area = 0, vol = 0, height = 0;
	        
	    System.out.println("Enter Radius: ");
	    radius = input.nextDouble();

	    System.out.println("Enter Height: ");
       	height = input.nextDouble();

       	area = areaCalc(radius);
       	vol = volumeCalc(area, height);
	        
	    System.out.println("Your circle's area is " + area + ", and the cylinder's volume is " + vol);

	}
}