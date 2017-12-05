import java.util.Scanner;

/* This program calculates the times table of any number*/

class multiplicationTable 
{

    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);        
        
        int table, total;
        
        System.out.print("Enter Your Table:");
        table = input.nextInt();
        
        for (int i = 1; i <= 12; i++)
        {
            total = table*i;
            System.out.println (table + " * " + i + " = " + total);

        }
    }
}