

// Q2 ==============================================================================================
// a  -------------------------------------------------------------------------------------------------------------------------

using System;

namespace tharindu_s_psudo
{
    class areaAndVolume{

        public void calculate(int x, int y){
            Console.WriteLine("area :" + x*y);
        }

        public void calculate(int x, int y, int z){
            Console.WriteLine("volume :" + x*y*z);
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            areaAndVolume obj1 = new areaAndVolume();
            obj1.calculate(5,5);
            obj1.calculate(5,5,10);
        }
    }
}


// d -------------------------------------------------------------------------------------------------------------------------

using System;

namespace abstractClass
{
    abstract class Animal
    {
        public abstract void animalSound();
    }

    class Pig : Animal
    {
    public override void animalSound()
        {
            Console.WriteLine("The pig says: wee wee");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Pig myPig = new Pig();
            myPig.animalSound();

        }
    }
}



// e -------------------------------------------------------------------------------------------------------------------------




using System;
namespace company
{
    class employee{
        public string name = "Jagath";
        protected string nic = "8615123548825v";
        private string position = "Senior Dick Inspector";
        internal string address = "1/3, Ambakissa, Paiyagala";

        public void displayData(){
            Console.WriteLine(name +" "+ nic +" "+ position +" "+ address);
        }
    }

    class manager : employee{
        public string department = "Dikitha Departhamenthuwa";
        public string joinDate = "2002/05/07";

        public void displayData(){
            Console.WriteLine(name +" "+ department +" "+ joinDate);
        }
    }

    class Program {
        static void Main(string[] args)
        {
            employee obj1 = new employee();
            obj1.displayData();
            Console.WriteLine(obj1.name);
            
            manager obj2 = new manager();
            Console.WriteLine(obj2.department +" "+ obj2.joinDate );
            obj2.displayData();
        }
    }
}






// 3 |------------------------------------------------------------------------------------

// a--------------------------------------------------------------------

using System;

namespace zeroDemo{
    class ExceptionDemo
    {
        static void Main(string[] args)
        {
            int a = 10;
            int b = 0;
            int c = 0;

            try
            {
                c = a / b;
                Console.WriteLine(c);
            }
            catch (DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}


// b --------------------------------------------------------------------------------

using System;

namespace company{
    public partial class MainWindow : Window{

        int otHrs = 0, basicSal = 0;
        string empType = "";

        void btnInputData_Click(object sender, EventArgs e){
            
        }

        void calculateData(){

        }

        void display(){

        }
    }
}
