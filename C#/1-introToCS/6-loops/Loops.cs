using System;

namespace Loops
{
    static class Initializer
    {
        public static void ByteLoop(int limit)
        {
            for (byte i = 0; i < limit; i++)
            {
                Console.WriteLine(i.ToString());
            }
        }

        public static void FloatLoop(decimal limit)
        {
            for (decimal i = 0.2m; i < limit; i *= 2)
            {
                Console.WriteLine(i.ToString());
            }
        }

        public static void DumbLoop(int start, int limit)
        {
            for (int i = start; i < limit; i *= 2)
            {
                Console.WriteLine($"i: {i}, limit: {limit}");
                limit++;
                i--;
            }
        }

        public static void isFinished()
        {
            int i = 0;
            bool finished = false;
            DateTime endTime = DateTime.Now.AddSeconds(5);
            Random random = new Random();

            while (endTime > DateTime.Now && !finished)
            {
                Console.WriteLine($"i: {i} {DateTime.Now.ToString("hh:mm:ss.fff")}");
                System.Threading.Thread.Sleep(random.Next(10, 500));
                finished = i++ == 9;
            }
        }
    }
}