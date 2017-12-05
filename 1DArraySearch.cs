using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace A1DArraySearch
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();

            int[] a; 
            a = new int[10];
            
            int b, ii;
            b = ii = 0;      
            
            bool found, failed;
            found = failed = false;

            for (int i = 0; i <= 9; i++)
            a[i] = a[i-1] + r.Next(1, 5);
            
            Console.Write("Enter search value: ");
            b = int.Parse(Console.Readline());

            i = 0;

            do 

            i++;

            if (a[i] == b)
                found = true;
                ii = i;
                Console.WriteLine("Your search value is at " + ii);
            else if (a[i] > b)
                    failed = true;
                    Console.WriteLine("Your search value isn't in this array.");

            Console.ReadLine();
        }
    }
}