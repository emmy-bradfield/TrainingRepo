using System;

namespace Checkers
{
    class Checkerboard
    {
        private int[,] checkerboard;
        private int rows;
        private int cols;

        public Checkerboard(int rows, int cols)
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