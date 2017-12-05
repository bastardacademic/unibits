using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2D_array_graph
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();

            int n = 10;

            int[,] a;
            a = new int[n, n];

            for (int i = 0; i < n; i++)
                a[i, j] = r.Next(0, 10);

            for (int j = 0; j < n; j++)
                a[j, i] = r.Next(0, 10);

            for (int i = j)
                a[i, j] = n * n + n;

            Console.ReadLine());
        }
    }
}
