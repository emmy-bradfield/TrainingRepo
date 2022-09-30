using System;
using Loops;
using Lists;

namespace Program
{
    class Runner
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("==== Loops: Deep Dive ====");
            Initializer.ByteLoop(10);
            Initializer.FloatLoop(10);
            Initializer.DumbLoop(3, 9);
            Initializer.isFinished();

            Console.WriteLine("==== Lists & Iteration ====");
            List<string> planets = new List<string>();
            planets.AddRange("Mercury,Venus,Earth,Mars,Jupiter,Saturn,Uranus,Neptune,Pluto".Split(','));

            Iterator.PrintItems(planets);
            Iterator.RemoveItem(planets, "Earth");
        }
    }
}