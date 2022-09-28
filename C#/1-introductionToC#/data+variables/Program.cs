using System;

namespace dataVariables
{
    class Program
    {
        static void Main(string[] args)
        {
            float fAnswer = 3.65f + 0.05f;
            Console.WriteLine($"float answer should be 3.7 but is {fAnswer}");

            double dAnswer = 3.65d + 0.05d;
            Console.WriteLine($"double answer should be 3.7 but is {dAnswer}");

            decimal mAnswer = 3.65m + 0.05m;
            Console.WriteLine($"decimal answer should be 3.7 but is {mAnswer}");

            fAnswer = 0.09f * 100f;
            float fAnswer2 = 0.09f * 99.99999999999999f;
            bool areEqual = fAnswer == fAnswer2;
            Console.WriteLine($"are {fAnswer} and {fAnswer2} equal?\n {areEqual}\n\n");

            string[] arrayOfStrings = { "how", "now", "brown", "cow" };
            int[] arrayOfInts = { 0, 1, 2, 3 };
            char[] arrayOfChars = {};

            Console.WriteLine($"arrayOfStrings has {arrayOfStrings.Length} elements\n{arrayOfStrings[0]}, {arrayOfStrings[1]}, {arrayOfStrings[2]}, and {arrayOfStrings[3]}");
            Console.WriteLine($"arrayOfInts has {arrayOfInts.Length} elements\n{arrayOfInts[0]}, {arrayOfInts[1]}, {arrayOfInts[2]}, and {arrayOfInts[3]}");

            string animal = arrayOfStrings[3];

            arrayOfChars = new char[animal.Length];
            arrayOfChars[0] = animal[0];
            arrayOfChars[1] = animal[1];
            arrayOfChars[2] = animal[2];

            Console.WriteLine($"arrayOfChars has {arrayOfChars.Length} elements\n {arrayOfChars[0]}, {arrayOfChars[1]}, {arrayOfChars[2]}\n");

            int[,] checkers = new int[4, 4];
            checkers[0, 0] = 1;
            checkers[0, 1] = 0;
            checkers[0, 2] = 1;
            checkers[0, 3] = 0;

            checkers[1, 0] = 1;
            checkers[1, 1] = 0;
            checkers[1, 2] = 1;
            checkers[1, 3] = 0;

            checkers[2, 0] = 1;
            checkers[2, 1] = 0;
            checkers[2, 2] = 1;
            checkers[2, 3] = 0;

            checkers[3, 0] = 1;
            checkers[3, 1] = 0;
            checkers[3, 2] = 1;
            checkers[3, 3] = 0;

            Console.WriteLine($"{checkers[0, 0]}, {checkers[0, 1]}, {checkers[0, 2]}, {checkers[0, 3]}");
            Console.WriteLine($"{checkers[1, 0]}, {checkers[1, 1]}, {checkers[1, 2]}, {checkers[1, 3]}");
            Console.WriteLine($"{checkers[2, 0]}, {checkers[2, 1]}, {checkers[2, 2]}, {checkers[2, 3]}");
            Console.WriteLine($"{checkers[3, 0]}, {checkers[3, 1]}, {checkers[3, 2]}, {checkers[3, 3]}");
        }
    }
}