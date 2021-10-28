using System;

namespace yolo
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Who's ur Favorite Star");
            string name =  Console.ReadLine();
            Console.WriteLine("How old are you?");
            byte age = Convert.ToByte(Console.ReadLine());
            if (age<18){
                Console.WriteLine("Ammo oi. Go back to school!");
                Console.WriteLine("{0} is not suitable for {1}year old girls.", name, age);
            }else{
                Console.WriteLine("Ah. Lovely. You are cool. You may love {0}", name);
            }
        }
    }
}
