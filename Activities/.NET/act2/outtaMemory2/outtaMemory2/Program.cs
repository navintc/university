using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;





namespace outtamemory2
{
    static class Program
    {

        static void Main(string[] args)
        {
            try
            {
                string[] strArray = GetArray();
            }
            catch (OutOfMemoryException ex)
            {
                Console.WriteLine("OutOFMemoey Exeption is caught-- ", ex.Message.ToString());
            }
        }

        public static string[] GetArray()
        {
            List<string> strList = new List<string>();
            for (int i = 0; i <= int.MaxValue; i++)
            {
                strList.Add("Hello");
            }
            return strList.ToArray();
        }
    }
}
