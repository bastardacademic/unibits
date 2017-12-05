using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimsAlgorithm
{
    class Program
    {
        static void Main(string[] args)
        {
         Random r = new Random();

         int n = 9;

         int[,] a;
         a = new int[n, n];

         int[,] c;
         c = new int[n, n];

         int ish = 0;
         int jsh = 0;
         int shortest = 0;

         int [] s;
         s = new int[9];

         int start = 0;

         for (int i = 0; i < n - 1; i++)
         {
                s[i] = 0;

                for (int j = 0; j < i + 1; j++)
                    c[j, i] = r.Next(0, 9);

                for (int i = j)
                {
                    c[i, j] = n * n + n;
                }
                
                c[i, j] = r.Next(0, 9);

                a[i, j] = 0;
         }
         s[n] = 0;

         Console.ReadLine());

        }
    }
}
