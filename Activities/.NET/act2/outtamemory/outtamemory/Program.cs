using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace outtamemory
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main(string[] args)
        {
            //Application.EnableVisualStyles();
            //Application.SetCompatibleTextRenderingDefault(false);
            //Application.Run(new Form1());
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
            for (int i=0; i <= int.MaxValue; i++)
            {
                strList.Add("Hello");
            }
            return strList.ToArray();
        }
    }
}
