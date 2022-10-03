using System;

namespace Condition
{
    class If
    {
        public static void LightSource()
        {            
            string direction;
            int moon = 200;

            Console.Write("Your porch light in lumens: ");
            int myLight = Convert.ToInt32(Console.ReadLine());
            Console.Write("Your neighbours porch light in lumens: ");
            int theirLight = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"The moon in lumens: 200");
            System.Threading.Thread.Sleep(500);

            if (myLight > moon) direction = "towards my porch";
            else if (theirLight > moon) direction = "towards my neighbours porch";
            else direction = " towards the moon";
            Console.WriteLine($"As a result, the moth flies {direction}\n");
            System.Threading.Thread.Sleep(1000);
        }
    }
}