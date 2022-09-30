using System;
using Checkers;

namespace classes
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("C# Classes and Object-Oriented Programming");

            Console.WriteLine("Iterating through an array, checkers, created without using OOP");
            gotoMethod();
            Console.WriteLine("");


            Console.WriteLine("Iterating through an array, checkers, created using OOP: forLoops");
            forLoopsMethod();
            Console.WriteLine("");

            Console.WriteLine("Iterating through an array, checkers, using OOP and classes");
            Checkers game = new Checkers(8, 8);
            game.CreateCheckerboard();
            Console.WriteLine("");

            Console.WriteLine("Iteraring through an array, checkers, using OOP with refined classes");
            Checkerboard board = new Checkerboard(8, 8);
            board.CreateCheckerboard();
            Console.WriteLine("");

        }

        // GOTO METHOD - NOT OOP
        public static void gotoMethod()
        {
            int[,] checkers = new int[4, 4];

            int y = 0;
            bool squareValue = true;

        PopulateCheckers:
            checkers[y, 0] = Convert.ToInt32(squareValue);
            checkers[y, 1] = Convert.ToInt32(!squareValue);
            checkers[y, 2] = Convert.ToInt32(squareValue);
            checkers[y, 3] = Convert.ToInt32(!squareValue);
            Console.WriteLine($" | {checkers[y, 0]} | {checkers[y, 1]} | {checkers[y, 2]} | {checkers[y, 3]} |");
            squareValue = !squareValue;
            y++;

            if (y > 3)
            {
                goto Finish;
            }
            goto PopulateCheckers;

        Finish:
            return;
        }

        // FOR LOOPS METHOD - OOP
        public static void forLoopsMethod()
        {
            int[,] checkers = new int[4, 4];
            bool squaredValue = true;
            for (int i = 0; i < 4; i++)
            {
                populateArray(ref checkers, i, squaredValue);
                squaredValue = !squaredValue;
            }
            printArray(checkers);
        }

        public static void populateArray(ref int[,] array, int row, bool sv)
        {
            for (int col = 0; col < 4; col++)
            {
                array[row, col] = Convert.ToInt32(sv);
                sv = !sv;
            }
        }

        public static void printArray(int[,] checkers)
        {
            for (int r = 0; r < 4; r++)
            {
                for (int c = 0; c < 4; c++)
                {
                    Console.Write($" | {checkers[r, c]}");
                }
                Console.Write(" |\n");
            }
        }
    }

    // CLASSES METHOD - OOP
    class Checkers
    {
        private int[,] checkerboard;
        private int rows;
        private int cols;

        public Checkers(int rows, int cols)
        {
            this.rows = rows;
            this.cols = cols;
            this.checkerboard = new int[rows, cols];
            Setup();
        }

        private void Setup()
        {
            bool binary = true;
            for (int r = 0; r < rows; r++)
            {
                for (int c = 0; c < cols; c++)
                {
                    checkerboard[r, c] = Convert.ToInt32(binary);
                    binary = !binary;
                }
                binary = !binary;
            }
        }

        public void CreateCheckerboard()
        {
            for (int r = 0; r < rows; r++)
            {
                for (int c = 0; c < cols; c++)
                {
                    Console.Write($" | {checkerboard[r, c]}");
                }
                Console.Write(" |\n");
                if (r < rows - 1)
                {
                    for (int i = 0; i < cols; i++)
                    {
                        Console.Write("-+--");
                    }
                    Console.Write("-+-\n");
                }
                
            }
        }
    }

}