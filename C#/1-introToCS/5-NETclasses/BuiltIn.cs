using System;

namespace Integers
{
    class BuiltIn
    {
        private string name;
        private int count;
        private double floating;
        private char c;
        private int[] intArray = new int[10];

        public BuiltIn()
        {
            name = "John";
            count = name.Length;
            floating = 1.2;
            c = 'c';
            intArray[0] = 1;

            name = name + " " + c + count;
            Console.WriteLine($"count is {count.GetType()}");
            Console.WriteLine($"name is {name.GetType()}");
            Console.WriteLine($"intArray is {intArray.GetType()} of length {intArray.Length}");
            Console.WriteLine($"floating is {floating.GetType()}");
            Console.WriteLine($"AppName is {AppDomain.CurrentDomain.FriendlyName}");
            Console.WriteLine($"this class is called {this.GetType().Name} and is located in the {this.GetType().Namespace} namespace");
        }

    }
}