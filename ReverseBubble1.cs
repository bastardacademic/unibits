using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseBubble1
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();

            int[] a; 
            a = new int[10];
            
            int j, k, Temp;
            i = j = k = Temp = 0;      

            for (int i = 0; i <= 9; i++)
            a[i] = r.Next(0, 10);

            Console.Write(" a[" + i + "] = " + a[i]);
            Console.WriteLine();
            
            for (i = 1; i < n; i++)
            {
                k = i;
                for (j = i + 1; j <= n; i++)
                    if (a[j] < a[k])
                        k = j;
            
                Temp = a[i];
                a[i] = a[k];
                a[k] = Temp;

            }   
            Console.ReadLine();
        }
    }
}