using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleTest
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Type a");
            byte a = Convert.ToByte(Console.ReadLine());
            Console.WriteLine("Type b");
            byte b = Convert.ToByte(Console.ReadKey());
            int c = (int)(a+b);
            Console.WriteLine("Value: {0}", c);
            Console.ReadKey();
        }
    }
}

