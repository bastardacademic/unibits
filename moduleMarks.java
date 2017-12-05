import java.util.Scanner;

/* This program calculate whether a student has passed a course by using the individual module marks*/

class moduleMarks
{
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);    	
        
        int marks[] = new int[6];
        double avg = 0, sum = 0;
        String name = "";
            
        while (!name.contentEquals("End") )
        {
	        System.out.println("Student name ('End' to quit)");
	        name = input.next();

	        if (name.contentEquals("End") )
	        	{break;}
	        
	        for (int i = 0; i < 6; i++)
	        {
		        System.out.println("Enter the student's module marks: " + (i + 1));
		        marks[i]= input.nextInt();
		        sum += marks[i];

	        }
	        
	        avg = sum / 6;
	        
	        if (avg >= 40) 
	        {
	        	System.out.println("");
	        	System.out.println("Pass");
	        	System.out.println("");
	        
	        } 
	        
	        else if(avg < 40 && avg >= 0) 
	        {
	        	System.out.println("Fail");
	        
	        } 
        }
    }
}